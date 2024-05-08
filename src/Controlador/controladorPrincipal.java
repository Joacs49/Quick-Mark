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

public class controladorPrincipal implements ActionListener {

    private Principal principal;
    
    private Productos productos;
    private Categoria categoria;
    private Pedidos pedidos;
    private Proveedor proveedor;
    private Cuenta cuenta;
    
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
            ocultar(true);

        }
        if (e.getSource() == principal.Inventario) {
            G_Inventario inventario = new G_Inventario();
            principal.jDesktopPane1.add(inventario);
            inventario.setUI(null);
            inventario.setVisible(true);

            ocultar(false);
        }
        if (e.getSource() == principal.Pedidos) {
            G_Pedidos pedidos = new G_Pedidos();
            principal.jDesktopPane1.add(pedidos);
            pedidos.setUI(null);
            pedidos.setVisible(true);

            ocultar(false);
        }
        if (e.getSource() == principal.Proveedores) {
            G_Proveedores proveedores = new G_Proveedores();
            principal.jDesktopPane1.add(proveedores);
            proveedores.setUI(null);
            proveedores.setVisible(true);

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

}
