/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import Model.DAO.Conexao;
import Model.DAO.LoginDAO;
import View.Cadastro;
import java.sql.SQLException;


/**
 *
 * @author hide
 */
public class LoginController {
    
    public void cadastroUsuario(Cadastro view) throws SQLException{
        
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getTxtEmpresa().getText(), view.getTxtEmail().getText(), view.getTxtSenha().getText(), view.getTxtCNPJ().getText());
    
    
    }

   
}
