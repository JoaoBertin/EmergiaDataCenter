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
    abstract public class Pessoa {
    protected  int id;
    protected String nome;
    protected char sexo;
    protected Date datanascimento;
    protected int rg;
    protected String email;
    protected String empresa;

    public Pessoa(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public Pessoa(int id, String nome, char sexo, Date datanascimento, int rg, String email, String empresa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.rg = rg;
        this.email = email;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public int getRg() {
        return rg;
    }

    public String getEmail() {
        return email;
    }

    public String getEmpresa() {
        return empresa;
    }
    
    
    
    
    
}
