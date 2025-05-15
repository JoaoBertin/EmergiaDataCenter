/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.*;
import Model.DAO.Conexao;
import Model.DAO.LoginDAO;
import View.Cadastro;
import View.Login;


// Esta classe é responsável por gerenciar o processo de login e cadastro de usuários.
// Ela interage com as views para coletar informações do usuário e as insere ou valida no banco de dados.
public class LoginController {
    
 
    // Método para cadastrar um novo usuário. Recebe uma view como parâmetro.
    // Este método coleta os dados que o usuário digitou na tela e os insere no banco de dados.
    public void cadastroUsuario(Cadastro view) throws SQLException{ 
        // Estabelece uma conexão com o banco de dados.
        Connection conexao = new Conexao().getConnection();
        // Cria uma instância do DAO que gerencia operações de login.
        LoginDAO cadastro = new LoginDAO();
        // Chama o método de cadastro passando os dados do usuário coletados da view.
        cadastro.cadastrarUsuario(view.getTxtEmpresa().getText(), view.getTxtEmail().getText(), view.getTxtSenha().getText(), view.getTxtCNPJ().getText());
    
    
    }
    
    // Método para realizar o login de um usuário. Também recebe uma view como parâmetro.
    // Verifica se o email e senha digitados existem no banco de dados.
    public void loginUsuario(Login view) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        // Cria uma instância do DAO responsável por gerenciar login.
        LoginDAO login = new LoginDAO();
        // Chama o método de login passando as credenciais coletadas da view.
        login.login(view.getTxtEmail().getText(), view.getTxtSenha().getText());
        
    
    
    }
   
}
