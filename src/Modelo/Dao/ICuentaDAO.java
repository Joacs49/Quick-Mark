/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.Dao;

import Modelo.Cuenta;

public interface ICuentaDAO {
    
    public boolean crearCuenta(Cuenta cuenta);
    public boolean verificarCuenta(Cuenta cuenta);
    public String recuperarCuenta(String id);
}
