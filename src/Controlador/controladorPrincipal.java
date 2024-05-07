/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vistas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controladorPrincipal implements ActionListener{
    
    private Principal principal;

    public controladorPrincipal(Principal principal) {
        this.principal = principal;
    }
    
    public void iniciar(){
        principal.setTitle("Principal");
        principal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
