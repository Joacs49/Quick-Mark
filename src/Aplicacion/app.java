/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

import Controlador.controladorInicio;
import Modelo.Cuenta;
import Vistas.Inicio_Sesion;

public class app {

    public static void main(String[] args) {
        Inicio_Sesion inicio = new Inicio_Sesion();
        Cuenta cuenta = new Cuenta();
        
        controladorInicio controlador = new controladorInicio(inicio, cuenta);
        controlador.iniciar();
    }
    
} 
