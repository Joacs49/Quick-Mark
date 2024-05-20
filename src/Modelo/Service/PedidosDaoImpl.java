/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Service;

import Conexion.cConexion;
import Modelo.Cuenta;
import Modelo.Pedidos;
import Modelo.Productos;
import Modelo.Dao.IPedidosDAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PedidosDaoImpl implements IPedidosDAO {

    private cConexion cn;
    private PreparedStatement pst;
    private ResultSet rst;

    private int filaS;
    private DefaultTableModel model = new DefaultTableModel();

    public PedidosDaoImpl() {
        cn = new cConexion();
    }

    @Override
    public void mostrar(JTable jTable1) {
        try {
            DefaultTableModel model = new DefaultTableModel(new Object[]{"ID_PEDIDO", "COD_PROD", "FECHA_PEDIDO", "ID_TRABAJADOR", "CANTIDAD", "PRECIO", "ESTADO"}, 0);

            pst = cn.conectar().prepareCall("CALL MOSTRAR_ALL_PEDIDOS()");

            rst = pst.executeQuery();

            while (rst.next()) {
                rst.getInt(1);
                rst.getInt(2);
                rst.getDate(3);
                rst.getString(4);
                rst.getInt(5);
                rst.getDouble(6);
                rst.getString(7);

                Object[] fila = {rst.getInt(1), rst.getInt(2), rst.getDate(3), rst.getString(4), rst.getInt(5),
                    rst.getDouble(6), rst.getString(7)};
                model.addRow(fila);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
    }

    private String verificarCantidadProductos() {
        String cadena = "";
        try {

            pst = cn.conectar().prepareCall("CALL MOSTRAR_PRODUCTOS()");

            rst = pst.executeQuery();

            while (rst.next()) {
                cadena += rst.getInt(1) + "," + rst.getInt(4) + "," + rst.getInt(5) + "," + 
                        rst.getInt(6) + "\n";
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
        return cadena;
    }

    @Override
    public void insertar(Pedidos pedidos, Cuenta cuenta, Productos prod) {
        int codigo = 0, minimo = 0, cantidad = 0, maximo = 0;
        boolean productoEncontrado = false;
        try {
            String datos = verificarCantidadProductos();
            String[] productos = datos.split("\n");

            for (String producto : productos) {
                String[] columnas = producto.split(",");

                if (columnas.length == 4) {
                    codigo = Integer.parseInt(columnas[0].trim());
                    maximo = Integer.parseInt(columnas[1].trim());
                    minimo = Integer.parseInt(columnas[2].trim());
                    cantidad = Integer.parseInt(columnas[3].trim());

                    if (codigo == prod.getCod_prod()) {
                        productoEncontrado = true;
                        break;
                    }

                }

            }

            if (productoEncontrado == true) {
                if (minimo < cantidad) {
                    JOptionPane.showMessageDialog(null, "Todavia hay stock de productos.");
                } else {
                    if (pedidos.getCantidad() <= maximo) {
                        pst = cn.conectar().prepareCall("CALL INSERTAR_PEDIDOS(?,?,?,?,?,?)");

                        pst.setString(1, pedidos.getFecha_pedido());
                        pst.setString(2, cuenta.getId_trabajador());
                        pst.setInt(3, prod.getCod_prod());
                        pst.setInt(4, pedidos.getCantidad());
                        pst.setDouble(5, pedidos.getPrecio());
                        pst.setString(6, pedidos.getEstado());

                        pst.executeUpdate();
                    }else{
                        JOptionPane.showMessageDialog(null, "La cantidad no puede exceder el stock maximo.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el producto.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
            System.out.println(e);
        }
    }

    private void modificarDB(int columna, String nuevo, int id) {
        try {
            pst = cn.conectar().prepareCall(
                    "CALL ACTUALIZAR_PEDIDOS(?,?,?)");

            pst.setInt(1, columna);
            pst.setString(2, nuevo);
            pst.setInt(3, id);

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
    }

    @Override
    public void modificar(JTable jTable1, JTextField dato) {
        try {
            filaS = jTable1.getSelectedRow();

            if (filaS >= 0) {
                model = (DefaultTableModel) jTable1.getModel();

                jTable1.getModel().addTableModelListener(new TableModelListener() {
                    @Override
                    public void tableChanged(TableModelEvent e) {
                        int columna = e.getColumn();
                        int fila = e.getFirstRow();

                        String nuevo = jTable1.getValueAt(fila, columna).toString();
                        String antiguo = jTable1.getValueAt(fila, 0).toString();

                        int id = Integer.parseInt(antiguo);

                        if (columna == 2 || columna == 5) {
                            modificarDB(columna, nuevo, id);
                            mostrar(jTable1);
                        } else {
                            if (columna == 6 && nuevo.equalsIgnoreCase("Proceso") || 
                                    nuevo.equalsIgnoreCase("Enviado") || 
                                    nuevo.equalsIgnoreCase("Finalizado")) {
                                modificarDB(columna, nuevo, id);
                                mostrar(jTable1);
                            } else {
                                JOptionPane.showMessageDialog(null, "No se puede modificar");
                                mostrar(jTable1);
                            }
                        }

                        if (nuevo != null) {
                            dato.setText(nuevo);
                        } else {
                            dato.setText("");
                        }
                    }
                }
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
    }

    private void eliminarDB(int columna, String eliminar) {
        try {
            pst = cn.conectar().prepareCall(
                    "CALL ELIMINAR_PEDIDOS(?,?)");

            pst.setInt(1, columna);
            pst.setString(2, eliminar);

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
            System.out.println(e);
        }
    }

    @Override
    public void eliminar(JTable jTable1, String eliminar) {
        try {
            model = (DefaultTableModel) jTable1.getModel();

            JTableHeader header = jTable1.getTableHeader();

            header.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    int columna = header.columnAtPoint(e.getPoint());

                    if (columna == 0 || columna == 6 && eliminar.equalsIgnoreCase("Finalizado")) {
                        eliminarDB(columna, eliminar);
                        header.removeMouseListener(this);
                        mostrar(jTable1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Este campo no se puede modificar");

                    }
                }
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
    }

    private String busquedaFiltrada(String buscar) {
        String cadena = "";
        try {
            pst = cn.conectar().prepareCall(
                    "CALL FILTRAR_PEDIDOS(?)");

            pst.setString(1, "%" + buscar + "%");

            rst = pst.executeQuery();

            while (rst.next()) {

                cadena += rst.getString(1) + "," + rst.getString(2) + "," + rst.getString(3) + ","
                        + rst.getString(4) + "," + rst.getString(5) + "," + rst.getString(6) + ","
                        + rst.getString(7) + "\n";
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
        return cadena;
    }

    private String busqueda(String buscar) {
        String cadena = "";
        try {
            pst = cn.conectar().prepareCall(
                    "CALL BUSQUEDA_CODIGOS(?)");

            pst.setString(1, buscar);

            rst = pst.executeQuery();

            while (rst.next()) {

                cadena += rst.getString(1) + "," + rst.getString(2) + "," + rst.getString(3) + ","
                        + rst.getString(4) + "," + rst.getString(5) + "," + rst.getString(6) + ","
                        + rst.getString(7) + "\n";
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
            System.out.println(e);
        }
        return cadena;
    }

    @Override
    public void mostrarFiltrado(JTable jTable1, String buscar) {
        try {
            if (buscar.length() == 1) {
                String datos = busqueda(buscar);
                String saltoLinea[] = datos.split("\n");

                DefaultTableModel model = new DefaultTableModel(new Object[]{"ID_PEDIDO", "COD_PROD", "FECHA_PEDIDO", "ID_TRABAJADOR", "CANTIDAD", "PRECIO", "ESTADO"}, 0);

                for (String div : saltoLinea) {
                    Object columnas[] = div.split(",");

                    if (columnas.length == 7) {
                        Object objeto[] = {columnas[0], columnas[1], columnas[2], columnas[3], columnas[4], columnas[5], columnas[6]};
                        model.addRow(objeto);
                    }
                }
                jTable1.setModel(model);
            } else {
                String datos = busquedaFiltrada(buscar);
                String saltoLinea[] = datos.split("\n");

                DefaultTableModel model = new DefaultTableModel(new Object[]{"ID_PEDIDO", "COD_PROD", "FECHA_PEDIDO", "ID_TRABAJADOR", "CANTIDAD", "PRECIO", "ESTADO"}, 0);

                for (String div : saltoLinea) {
                    Object columnas[] = div.split(",");

                    if (columnas.length == 7) {
                        Object objeto[] = {columnas[0], columnas[1], columnas[2], columnas[3], columnas[4], columnas[5], columnas[6]};
                        model.addRow(objeto);
                    }
                }
                jTable1.setModel(model);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Problema");
        }
    }
}
