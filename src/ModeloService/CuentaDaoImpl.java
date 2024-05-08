/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloService;

import Conexion.cConexion;
import Controlador.controladorPrincipal;
import Modelo.Cuenta;
import ModeloDao.ICuentaDAO;
import Vistas.Inicio_Sesion;
import Vistas.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CuentaDaoImpl implements ICuentaDAO{
    
    private cConexion cn;
    private PreparedStatement pst;
    private ResultSet rst;
    
    private Principal prin = new Principal();
    private Cuenta cuenta = new Cuenta();
    private controladorPrincipal principal = new controladorPrincipal(prin, cuenta);
    private Inicio_Sesion inicio = new Inicio_Sesion();
    
    public CuentaDaoImpl(){
        cn = new cConexion();
    }

    @Override
    public void crearCuenta(Cuenta cuenta) {
        try{
           pst = cn.conectar().prepareCall("CALL CREAR_CUENTA(?,?,?)"); 
           
           pst.setString(1, cuenta.getId_trabajador());
           pst.setString(2, cuenta.getUsuario());
           pst.setString(3, cuenta.getContraseña());
           
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Cuenta creada Exitosamente");
           
           inicio.setVisible(true);
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
    }

    @Override
    public boolean verificarCuenta(Cuenta cuenta) {
        try{
            pst = cn.conectar().prepareCall("CALL VERIFICAR_CUENTA(?,?)");
            
            pst.setString(1, cuenta.getId_trabajador());
            pst.setString(2, cuenta.getContraseña());
            
            rst = pst.executeQuery();
            
            if(rst.next()){
                principal.iniciar();
                return true;
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
        return false;
    }

    @Override
    public String recuperarCuenta(String id) {
        String cadena = "";
        try{
            pst = cn.conectar().prepareCall("CALL RECUPERAR_CUENTA(?)");
            
            pst.setString(1, id);
            
            rst = pst.executeQuery();
            
            while(rst.next()){
                rst.getString(2);
                
                cadena += rst.getString(2);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
        return cadena;
    }
}
