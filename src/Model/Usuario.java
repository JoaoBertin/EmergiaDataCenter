/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;


public class Usuario{ // Classe que representa um usuário e suas informações
    
    private String nome_empresa, email, senha, cnpj;

    public Usuario(String email, String senha) { // Construtor que inicializa o usuário com email e senha
        this.email = email;
        this.senha = senha;
    }
    
    public void cadastrar(String nome_empresa, String email, String senha, String cnpj){ // Método que cadastra um novo usuário com todos os detalhes
        this.nome_empresa = nome_empresa;
        this.email = email;
        this.senha = senha;
        this.cnpj = cnpj;
    
    }
        
    // Métodos para obter e definir os valores das variáveis de instância
    
    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
