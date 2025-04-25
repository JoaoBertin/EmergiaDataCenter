/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author davic
 */
public class Usuario extends Pessoa {
    protected String senha;
    protected int nivelacesso;

    public Usuario(int id, String email, String senha) {
        super(id, email);
        this.senha = senha;
    }

    public Usuario(String senha, int nivelacesso, int id, String nome, char sexo, Date datanascimento, int rg, String email, String empresa) {
        super(id, nome, sexo, datanascimento, rg, email, empresa);
        this.senha = senha;
        this.nivelacesso = nivelacesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelacesso() {
        return nivelacesso;
    }

    public void setNivelacesso(int nivelacesso) {
        this.nivelacesso = nivelacesso;
    }

    
}
