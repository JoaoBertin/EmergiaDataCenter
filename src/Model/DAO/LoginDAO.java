/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import View.Login;
import java.sql.*;

public class LoginDAO {
 // Classe responsável pela interação com o banco de dados para operações de login e cadastro de usuários.   
    
    
    public void cadastrarUsuario(String nome_empresa, String email, String senha, String cnpj) throws SQLException{
    // Estabelece uma conexão com a base de dados
    Connection conexao = new Conexao().getConnection();
    // Comando SQL para inserir um novo usuário na tabela 'login'
    String sql = "insert into login (nome_empresa, email, senha, cnpj) values ('"+nome_empresa+"', '"+email+"','"+senha+"', '"+cnpj+"')"; 
    // Prepara a instrução SQL para execução na base de dados
    PreparedStatement statment = conexao.prepareStatement(sql); 
    statment.execute();  // Executa a consulta para adicionar o usuário
    conexao.close();
    
    
    
    
    }
    public void login(String email, String senha) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    String sql = "select email,senha from login where email = '"+email+"' and senha = '"+senha+"'";
    PreparedStatement statment = conexao.prepareStatement(sql);
    ResultSet rs = statment.executeQuery();
    
    // Verifica se a consulta retornou algum resultado 
    // Se o usuário existe, imprime que possui
    // Caso contrário, informa que não possui
    if (rs.next()){
        System.out.println("Possui");
        
    } else {
        System.out.println("Não Possui");
    }
    
    
    
    
    
    conexao.close(); // Fecha a conexão com a base de dados
        
    }
    
}
