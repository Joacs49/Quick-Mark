/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ModeloDao;

import Modelo.Cuenta;

public interface ICuentaDAO {
    
    public void crearCuenta(Cuenta cuenta);
    public boolean verificarCuenta(Cuenta cuenta);
}
