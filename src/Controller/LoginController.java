/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Cadastro;
import View.MenuPrincipal;

/**
 *
 * @author hide
 */
public class LoginController {

    private final Cadastro view;
    private LoginHelper helper;

    public LoginController(Cadastro view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void entrarNoSistema(){
        // Pegar o Usuario da view
        Usuario usuario = helper.obterModelo();
        
        MenuPrincipal menu =  new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();
    
        //Pesquisa Usuario no Banco
        //Se o usuario da view tiver o mesmo usuario e senha vindo do banco vai direcionar ele para o menu
        // Caso não acontecer o login vai aparecer uma mensagem dizendo "Usuario ou senha incorretos"
    }
    
    public void fizTarefa(){
        System.out.println("Procurando dados do Banco");
        
        this.view.exibeMensagem("Logado com sucesso");
    }
    
}
