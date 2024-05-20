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

public class controladorRegistro implements ActionListener{
    
    private Registrar registrar;
    private Cuenta cuenta;
    private ICuentaDAO cuentaDao;
    
    private TextPrompt placeholder;
    
    public controladorRegistro(Registrar registrar, Cuenta cuenta){
        this.registrar = registrar;
        this.cuenta = cuenta;
        this.cuentaDao = new CuentaDaoImpl();
        
        registrar.Registrar.addActionListener(this);
    }
    
    public void iniciar(){
        registrar.setTitle("Registro de Sesion");
        
        placeholder = new TextPrompt("Ingrese su codigo", registrar.jTextField1);
        placeholder = new TextPrompt("Ingrese su usuario", registrar.jTextField2);
        placeholder = new TextPrompt("Ingrese su contraseña", registrar.jPasswordField1);

        registrar.setResizable(false);
        registrar.setLocationRelativeTo(null);
        
        registrar.jLabel3.setText(textoLabel3);
        registrar.jLabel6.setText(textoLabel6);
        
        registrar.jLabel6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Inicio_Sesion inicioSesion = new Inicio_Sesion();
                controladorInicio inicio = new controladorInicio(inicioSesion, cuenta);
                inicio.iniciar();
                registrar.dispose();
            }
        });
        
        registrar.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        cuenta.setId_trabajador(registrar.jTextField1.getText());
        cuenta.setUsuario(registrar.jTextField2.getText());
        cuenta.setContraseña(registrar.jPasswordField1.getText());
        
        if(e.getSource() == registrar.Registrar){
            boolean confirmar = cuentaDao.crearCuenta(cuenta);
            
            if(confirmar == true){
                registrar.dispose();
            }else{
                borrar();
            }
        }
    }
    
    private void borrar(){
        registrar.jTextField1.setText("");
        registrar.jTextField2.setText("");
        registrar.jPasswordField1.setText("");
    }
    
    private static final String textoLabel3 = "<html><span style='color: white; font-family: Perpetua; font-size: 14px;'>"
            + "Completa los campos con tus datos.</span></html>";
    
    private static final String textoLabel6 = "<html><span style='color: white; font-family: Perpetua; font-size: 14px;'>"
            + "¿Ya tienes cuenta? <b> Inicia Sesion. </b> </span></html>";
}
