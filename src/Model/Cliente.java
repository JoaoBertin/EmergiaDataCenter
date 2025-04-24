/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

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

    public Cliente(int cnpj, String classificacao, String setor, String endereco, String cep, int id, String email, String empresa, String senha) {
        super(id, email, empresa, senha);
        this.cnpj = cnpj;
        this.classificacao = classificacao;
        this.setor = setor;
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int cnpj, String classificacao, String setor, String endereco, String cep, int id, String email, String senha) {
        super(id, email, senha);
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
    @Override
public String toString() {
    return "Cliente{" +
           "cnpj=" + cnpj +
           ", classificacao='" + classificacao + '\'' +
           ", setor='" + setor + '\'' +
           ", endereco='" + endereco + '\'' +
           ", cep='" + cep + '\'' +
           ", id=" + id +
           ", email='" + email + '\'' +
           ", empresa='" + empresa + '\'' +
           '}';
}


    
 
    
    
    
    
    
    
}
