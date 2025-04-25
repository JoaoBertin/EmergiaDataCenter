/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Cadastro;

/**
 *
 * @author hide
 */
public class LoginController {

    private final Cadastro view;

    public LoginController(Cadastro view) {
        this.view = view;
    }
    
    
    public void entrarNoSistema(){
        
        String email = view.getTxtEmail().getText();
        String senha = view.getTxtSenha().getText();
        
        
        
        
    // Pega os dados do Usurio da view e do Banco e caso ele tiver o mesmo usuario e senha que o do Banco ele redireciona para o menu
    // Caso não acontecer o login vai aparecer uma mensagem dizendo "Usuario ou senha incorretos"
    }
    
    public void fizTarefa(){
        System.out.println("Procurando dados do Banco");
        
        this.view.exibeMensagem("Logado com sucesso");
    }
    
}
