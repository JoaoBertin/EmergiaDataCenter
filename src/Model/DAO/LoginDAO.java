/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import View.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginDAO {
    
    
    
    public void cadastrarUsuario(String nome_empresa, String email, String senha, String cnpj) throws SQLException{
    
    Connection conexao = new Conexao().getConnection();
    String sql = "insert into login (nome_empresa, email, senha, cnpj) values ('"+nome_empresa+"', '"+email+"','"+senha+"', '"+cnpj+"')";
    PreparedStatement statment = conexao.prepareStatement(sql);
    statment.execute();
    conexao.close();
    
    
    
    
    }
    public void login(String email, String senha) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    String sql = "select email,senha from login where email = '"+email+"' and senha = '"+senha+"'";
    PreparedStatement statment = conexao.prepareStatement(sql);
    ResultSet rs = statment.executeQuery();
    
    if (rs.next()){
        System.out.println("Possui");
        
    } else {
        System.out.println("Não Possui");
    }
    
    
    
    
    
    conexao.close();
        
    }
    
}
