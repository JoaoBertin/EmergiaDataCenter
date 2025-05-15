/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import java.sql.*;


public class Conexao {
    
    
    public Connection getConnection() throws SQLException{
        String url = "jdbc:sqlite:aps.db"; //Url do banco de dados
        Connection conexao = null;
        
        try{
            conexao = DriverManager.getConnection(url); //Conexão do Netbeans com o banco de dados e caso ele não conseguir conectar ele dara uma mensagem de erro
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conexao;
    }
    
}
