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
    protected  String nome;
    protected int nivelacesso;
    protected char sexo; 
    protected Date datanascimento;
    protected int rg;
    protected int cpf;

    public Usuario(String nome, int nivelacesso, char sexo, Date datanascimento, int rg, int cpf, int id, String email, String empresa, String senha) {
        super(id, email, empresa, senha);
        this.nome = nome;
        this.nivelacesso = nivelacesso;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Usuario(String nome, int nivelacesso, char sexo, Date datanascimento, int rg, int cpf, int id, String email, String senha) {
        super(id, email, senha);
        this.nome = nome;
        this.nivelacesso = nivelacesso;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelacesso() {
        return nivelacesso;
    }

    public void setNivelacesso(int nivelacesso) {
        this.nivelacesso = nivelacesso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
   @Override
public String toString() {
    return "Usuario{" +
           "nome='" + nome + '\'' +
           ", nivelacesso=" + nivelacesso +
           ", sexo=" + sexo +
           ", datanascimento=" + datanascimento +
           ", rg=" + rg +
           ", cpf=" + cpf +
           ", id=" + id +
           ", email='" + email + '\'' +
           ", empresa='" + empresa + '\'' +
           '}';
}

    
    
   
    
}
