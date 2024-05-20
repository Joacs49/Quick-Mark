/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cuenta;
import Modelo.TextPrompt;
import Modelo.Dao.ICuentaDAO;
import Modelo.Service.CuentaDaoImpl;
import Vistas.Inicio_Sesion;
import Vistas.Registrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class controladorInicio implements ActionListener {

    private Inicio_Sesion inicio;
    private Cuenta cuenta;
    private ICuentaDAO cuentaDao;

    private TextPrompt placeholder;
    private static String id;

    public controladorInicio(Inicio_Sesion inicio, Cuenta cuenta) {
        this.inicio = inicio;
        this.cuenta = cuenta;
        this.cuentaDao = new CuentaDaoImpl();

        inicio.Iniciar.addActionListener(this);
    }

    public void iniciar() {
        inicio.setTitle("Inicio de Sesion");

        placeholder = new TextPrompt("Ingrese su codigo", inicio.jTextField1);
        placeholder = new TextPrompt("Ingrese su contraseña", inicio.jPasswordField1);

        inicio.setResizable(false);
        inicio.setLocationRelativeTo(null);

        inicio.jLabel3.setText(textoLabel3);
        inicio.jLabel6.setText(textoLabel6);

        inicio.jLabel6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Registrar registrar = new Registrar();
                controladorRegistro registro = new controladorRegistro(registrar, cuenta);
                registro.iniciar();
                inicio.dispose();
            }
        });

        inicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cuenta.setId_trabajador(inicio.jTextField1.getText());
        cuenta.setContraseña(inicio.jPasswordField1.getText());

        if (e.getSource() == inicio.Iniciar) {
            id = cuentaDao.recuperarCuenta(cuenta.getId_trabajador());
            
            if (cuentaDao.verificarCuenta(cuenta)) {
                inicio.dispose(); 
            }else{
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }
        }

    }

    private static final String textoLabel3 = "<html><span style='color: white; font-family: Perpetua; font-size: 14px;'>"
            + "Inicia Sesion con tu cuenta de <b> Quick Mark. </b> </span></html>";

    private static final String textoLabel6 = "<html><span style='color: white; font-family: Perpetua; font-size: 14px;'>"
            + "¿No tienes cuenta? <b> Registrate. </b> </span></html>";

    public static String getId() {
        return id;
    }
}
