/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import java.sql.*;

/**
 *
 * @author hide
 */
public class Conexao {
    
    
    public Connection getConnection() throws SQLException{
        String url = "jdbc:sqlite:aps.db";
        Connection conexao = null;
        
        try{
            conexao = DriverManager.getConnection(url);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conexao;
    }
    
}
