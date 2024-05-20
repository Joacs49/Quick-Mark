/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.controladorInicio.getId;
import Modelo.Categoria;
import Modelo.Cuenta;
import Modelo.Pedidos;
import Modelo.Productos;
import Modelo.Proveedor;
import Modelo.TextPrompt;
import Modelo.Dao.ICuentaDAO;
import Modelo.Dao.IPedidosDAO;
import Modelo.Service.PedidosDaoImpl;
import Vistas.G_Inventario;
import Vistas.G_Pedidos;
import Vistas.G_Proveedores;
import Vistas.Inicio_Sesion;
import Vistas.Principal;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class controladorPrincipal implements ActionListener {

    private Principal principal;

    private G_Inventario inventario = new G_Inventario();
    private G_Pedidos pedidos_vista = new G_Pedidos();
    private G_Proveedores proveedores = new G_Proveedores();

    private Pedidos pedidos;
    private Productos productos;
    private Categoria categoria;
    private Proveedor proveedor;
    private Cuenta cuenta;

    private IPedidosDAO pedidosDao;

    private List<JInternalFrame> listaFrames = new ArrayList<>();
    private List<JButton> listaPrincipal = new ArrayList<>();

    private TextPrompt placeholder;
    private String valorAntiguo;

    public controladorPrincipal(Principal principal, Cuenta cuenta, G_Pedidos pedidos_vista, Pedidos pedidos, Productos productos) {
        this.principal = principal;
        this.pedidos_vista = pedidos_vista;

        this.cuenta = cuenta;
        this.pedidos = pedidos;
        this.productos = productos;

        this.pedidosDao = new PedidosDaoImpl();

        this.principal.Inicio.addActionListener(this);
        this.principal.Inventario.addActionListener(this);
        this.principal.Pedidos.addActionListener(this);
        this.principal.Proveedores.addActionListener(this);

        this.pedidos_vista.Mostrar.addActionListener(this);
        this.pedidos_vista.Modificar.addActionListener(this);
        this.pedidos_vista.Enviar.addActionListener(this);
        this.pedidos_vista.Eliminar.addActionListener(this);
        this.pedidos_vista.Insertar.addActionListener(this);
        this.pedidos_vista.jButton6.addActionListener(this);
        this.pedidos_vista.Cancelar.addActionListener(this);
    }

    public void iniciar() {
        principal.setTitle("Principal");

        principal.setLocationRelativeTo(null);
        principal.setResizable(false);

        inicializarListas();
        
        pedidos_vista.jTextField1.getDocument().addDocumentListener(new DocumentListener(){ 
            @Override
            public void insertUpdate(DocumentEvent e) {
                pedidosDao.mostrarFiltrado(pedidos_vista.jTable1, pedidos_vista.jTextField1.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                pedidosDao.mostrarFiltrado(pedidos_vista.jTable1, pedidos_vista.jTextField1.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                pedidosDao.mostrarFiltrado(pedidos_vista.jTable1, pedidos_vista.jTextField1.getText());
            }
            
        });

        principal.jLabel8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Inicio_Sesion inicioSesion = new Inicio_Sesion();
                controladorInicio inicio = new controladorInicio(inicioSesion, cuenta);
                inicio.iniciar();
                principal.dispose();
            }
        });

        principal.jLabel7.setText(getId().split(",")[1].trim());

        placeholder = new TextPrompt("Ingrese el elemento a buscar", pedidos_vista.jTextField1);

        placeholder = new TextPrompt("Ingrese la fecha", pedidos_vista.Des);
        placeholder = new TextPrompt("Ingrese la cantidad", pedidos_vista.Cant);
        placeholder = new TextPrompt("Ingrese el codigo del prod", pedidos_vista.Cod);
        placeholder = new TextPrompt("Ingrese el precio", pedidos_vista.Prec);

        placeholder = new TextPrompt("Selecciona un dato", pedidos_vista.jTextField2);
        placeholder = new TextPrompt("Modifique el dato", pedidos_vista.jTextField3);
        placeholder = new TextPrompt("Selecciona un dato", pedidos_vista.jTextField6);

        pedidos_vista.jPanel2.setVisible(false);
        pedidos_vista.jPanel3.setVisible(false);
        pedidos_vista.jPanel5.setVisible(false);

        BasicInternalFrameUI ui = (BasicInternalFrameUI) pedidos_vista.getUI();
        ui.setNorthPane(null);

        pedidos_vista.jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                valorAntiguo = pedidos_vista.jTable1.getValueAt(pedidos_vista.jTable1.getSelectedRow(), pedidos_vista.jTable1.getSelectedColumn()).toString();
            }
        });

        principal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == principal.Inicio) {

            cerrarInicio();

            ocultar(true);

        }

        //Inventario
        if (e.getSource() == principal.Inventario) {
            principal.jDesktopPane1.add(inventario);
            inventario.setUI(null);
            inventario.setVisible(true);

            cerrarPestañas(principal.Inventario);

            ocultar(false);
        }

        //Pedidos
        if (e.getSource() == principal.Pedidos) {
            principal.jDesktopPane1.add(pedidos_vista);
            pedidos_vista.setUI(null);
            pedidos_vista.setVisible(true);

            cerrarPestañas(principal.Pedidos);

            ocultar(false);
        }

        //Mostrar
        if (e.getSource() == pedidos_vista.Mostrar) {
            pedidosDao.mostrar(pedidos_vista.jTable1);
        }

        //Insertar
        if (e.getSource() == pedidos_vista.Insertar) {
            pedidos_vista.jPanel2.setVisible(true);
            pedidos_vista.addIMG.setVisible(false);
        }

        //Enviar - Insertar
        if (e.getSource() == pedidos_vista.Enviar) {
            pedidos.setFecha_pedido(pedidos_vista.Des.getText());
            cuenta.setId_trabajador(getId().split(",")[0].trim());
            productos.setCod_prod(Integer.parseInt(pedidos_vista.Cod.getText()));
            pedidos.setCantidad(Integer.parseInt(pedidos_vista.Cant.getText()));
            pedidos.setPrecio(Double.parseDouble(pedidos_vista.Prec.getText()));
            pedidos.setEstado("Proceso");

            pedidosDao.insertar(pedidos, cuenta, productos);
            pedidosDao.mostrar(pedidos_vista.jTable1);
            borrar(); 
        }

        //Eliminar
        if (e.getSource() == pedidos_vista.Eliminar) {
            pedidos_vista.jPanel5.setVisible(true);
            pedidos_vista.deleteIMG.setVisible(false);
        }

        //Enviar - Eliminar
        if (e.getSource() == pedidos_vista.jButton6) {
            pedidosDao.eliminar(pedidos_vista.jTable1, pedidos_vista.jTextField6.getText());
            
            borrar();
        }

        //Modificar
        if (e.getSource() == pedidos_vista.Modificar) {
            borrar();
            pedidos_vista.jTextField3.setText("");
            pedidos_vista.jTextField2.setText("");
            
            pedidos_vista.jPanel3.setVisible(true);
            pedidos_vista.modifyIMG.setVisible(false);

            pedidosDao.modificar(pedidos_vista.jTable1,pedidos_vista.jTextField3);
            pedidos_vista.jTextField2.setText(valorAntiguo);
        }

        //Proveedores
        if (e.getSource() == principal.Proveedores) {
            principal.jDesktopPane1.add(proveedores);
            proveedores.setUI(null);
            proveedores.setVisible(true);

            cerrarPestañas(principal.Proveedores);

            ocultar(false);
        }
        
        //Cancelar
        if (e.getSource() == pedidos_vista.Cancelar) {
            desactivar();
        }
    }

    private void ocultar(boolean tipo) {
        principal.jLabel4.setVisible(tipo);
        principal.jLabel9.setVisible(tipo);
        principal.jLabel10.setVisible(tipo);
        principal.jLabel11.setVisible(tipo);
        principal.jLabel12.setVisible(tipo);
    }

    public void inicializarListas() {
        listaPrincipal.clear();
        listaFrames.clear();

        listaPrincipal.add(principal.Inventario);
        listaPrincipal.add(principal.Pedidos);
        listaPrincipal.add(principal.Proveedores);

        listaFrames.add(inventario);
        listaFrames.add(pedidos_vista);
        listaFrames.add(proveedores);
    }

    private void cerrarPestañas(JButton boton) {
        for (int i = 0; i < listaPrincipal.size(); i++) {
            if (!listaPrincipal.get(i).equals(boton)) {
                listaFrames.get(i).dispose();
                principal.jDesktopPane1.remove(listaFrames.get(i));
            }
        }
    }

    private void cerrarInicio() {
        for (JInternalFrame frame : listaFrames) {
            frame.dispose();
            principal.jDesktopPane1.remove(frame);
        }
    }

    private void desactivar() {
        borrar();
        pedidos_vista.jPanel2.setVisible(false);
        pedidos_vista.addIMG.setVisible(true);
        pedidos_vista.jPanel3.setVisible(false);
        pedidos_vista.modifyIMG.setVisible(true);
        pedidos_vista.jPanel5.setVisible(false);
        pedidos_vista.deleteIMG.setVisible(true);
    }
    
    private void borrar(){
        pedidos_vista.Des.setText("");
        pedidos_vista.Cant.setText("");
        pedidos_vista.Cod.setText("");
        pedidos_vista.Prec.setText("");
        pedidos_vista.jTextField2.setText("");
        pedidos_vista.jTextField2.setText("");
        pedidos_vista.jTextField6.setText("");
    }

}
