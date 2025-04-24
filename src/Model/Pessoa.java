/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author davic
 */
public class Pessoa {
    protected  int id;
    protected String email;
    protected String empresa;
    protected String senha;

    public Pessoa(int id, String email, String empresa, String senha) {
        this.id = id;
        this.email = email;
        this.empresa = empresa;
        this.senha = senha;
    }

    public Pessoa(int id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
