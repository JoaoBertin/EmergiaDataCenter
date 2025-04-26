/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Consulta;
import View.MenuPrincipal;

/**
 *
 * @author hide
 */
public class MenuPrincipalController {
    
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    
    public void navegarParaConsulta(){
    
        Consulta consulta = new Consulta();
        consulta.setVisible(true);
        this.view.dispose();
        
    }
    
}
