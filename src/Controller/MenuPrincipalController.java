/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.CalcuEnergiaIncorporada;
import View.MenuPrincipal;


public class MenuPrincipalController {
    
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    
    public void navegarParaConsulta(){
    
        CalcuEnergiaIncorporada consulta = new CalcuEnergiaIncorporada();
        consulta.setVisible(true);
        this.view.dispose();
        
    }
    
}
