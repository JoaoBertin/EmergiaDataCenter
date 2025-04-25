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
public class Cliente extends Pessoa{
    private int cnpj;
    private String classificacao;
    private String setor; 
    private String endereco;
    private String cep; 

    public Cliente(int cnpj, String classificacao, String setor, String endereco, String cep, int id, String nome, char sexo, Date datanascimento, int rg, String email, String empresa) {
        super(id, nome, sexo, datanascimento, rg, email, empresa);
        this.cnpj = cnpj;
        this.classificacao = classificacao;
        this.setor = setor;
        this.endereco = endereco;
        this.cep = cep;
    } 

    public Cliente(int cnpj, String classificacao, String setor, String endereco, String cep, int id, String email) {
        super(id, email);
        this.cnpj = cnpj;
        this.classificacao = classificacao;
        this.setor = setor;
        this.endereco = endereco;
        this.cep = cep;
    }

    
    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }     
}
