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
    // Método público que verifica o login de um usuário, recebendo email e senha.
    public boolean verificarLogin(String email, String senha) throws SQLException {
        
    // Inicializa as variáveis de conexão e comando SQL.
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
        // Estabelece uma nova conexão com o banco de dados.
        conn = new Conexao().getConnection();
        
        // Define a consulta SQL que verifica se o email e a senha correspondem a um usuário.
        String sql = "SELECT email, senha FROM login WHERE email = ? AND senha = ?";
        
        // Prepara a consulta SQL usando a conexão estabelecida.
        stmt = conn.prepareStatement(sql);
        
        // Define os parâmetros da consulta (email e senha).
        stmt.setString(1, email);
        stmt.setString(2, senha);
        
        // Executa a consulta e armazena o resultado em 'rs'.
        rs = stmt.executeQuery();
        
        return rs.next(); // Retorna true se um usuário correspondente for encontrado
    } catch (SQLException e) {
        // Logar a exceção ou tratar conforme necessário
        e.printStackTrace();
        throw e; // Ou pode retornar um valor específico se necessário
    } finally {
        // Fechar os recursos
        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (stmt != null) try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
   }
  }
