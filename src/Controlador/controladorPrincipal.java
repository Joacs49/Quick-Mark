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
import Vistas.G_Inventario;
import Vistas.G_Pedidos;
import Vistas.G_Proveedores;
import Vistas.Inicio_Sesion;
import Vistas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class controladorPrincipal implements ActionListener {

    private Principal principal;

    private Productos productos;
    private Categoria categoria;
    private Pedidos pedidos;
    private Proveedor proveedor;
    private Cuenta cuenta;

    private G_Inventario inventario = new G_Inventario();
    private G_Pedidos pedido = new G_Pedidos();
    private G_Proveedores proveedores = new G_Proveedores();

    private List<JInternalFrame> listaFrames = new ArrayList<>();
    private List<JButton> listaPrincipal = new ArrayList<>();

    public controladorPrincipal(Principal principal, Cuenta cuenta) {
        this.principal = principal;
        this.cuenta = cuenta;

        principal.Inicio.addActionListener(this);
        principal.Inventario.addActionListener(this);
        principal.Pedidos.addActionListener(this);
        principal.Proveedores.addActionListener(this);
    }

    public void iniciar() {
        principal.setTitle("Principal");

        principal.setLocationRelativeTo(null);
        principal.setResizable(false);
        
        inicializarListas();

        principal.jLabel8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Inicio_Sesion inicioSesion = new Inicio_Sesion();
                controladorInicio inicio = new controladorInicio(inicioSesion, cuenta);
                inicio.iniciar();
                principal.dispose();
            }
        });

        principal.jLabel7.setText(getId());

        principal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == principal.Inicio) {

            cerrarInicio();

            ocultar(true);

        }
        if (e.getSource() == principal.Inventario) {
            principal.jDesktopPane1.add(inventario);
            inventario.setUI(null);
            inventario.setVisible(true);

            cerrarPestañas(principal.Inventario);

            ocultar(false);
        }
        if (e.getSource() == principal.Pedidos) {
            principal.jDesktopPane1.add(pedido);
            pedido.setUI(null);
            pedido.setVisible(true);

            cerrarPestañas(principal.Pedidos);

            ocultar(false);
        }
        if (e.getSource() == principal.Proveedores) {
            principal.jDesktopPane1.add(proveedores);
            proveedores.setUI(null);
            proveedores.setVisible(true);

            cerrarPestañas(principal.Proveedores);

            ocultar(false);
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
        listaFrames.add(pedido);
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

}
