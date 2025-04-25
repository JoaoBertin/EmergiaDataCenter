/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Cadastro;

/**
 *
 * @author hide
 */
public class LoginHelper {
   
    private final Cadastro view;

    public LoginHelper(Cadastro view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String email = view.getTxtEmail().getText();
        String senha = view.getTxtSenha().getText();
        Usuario model = new Usuario(0, email, senha);   
        return model;
    }
    
    public void setarModel(Usuario model){
        String email = model.getEmail();
        String senha = model.getSenha();
        
        view.getTxtEmail().setText(email);
        view.getTxtSenha().setText(senha);
    }
   
    public void limparTela(){
        view.getTxtEmail().setText("");
        view.getTxtSenha().setText("");
    }
}
