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



public class LoginController {
    
    
    public void cadastroUsuario(Cadastro view) throws SQLException{
        
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getTxtEmpresa().getText(), view.getTxtEmail().getText(), view.getTxtSenha().getText(), view.getTxtCNPJ().getText());
    
    
    }
    
    
    public void loginUsuario(Login view) throws SQLException{
        
        Connection conexao = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.login(view.getTxtEmail().getText(), view.getTxtSenha().getText());
        
    
    
    }
   
}
