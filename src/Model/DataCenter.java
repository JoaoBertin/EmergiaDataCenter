/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author davic
 */
public class DataCenter {

    private int id;
    private String nome;
    private String localizacao;
    private float consumoMensalKWh;

    public DataCenter(int id, String nome, String localizacao, float consumoMensalKWh) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.consumoMensalKWh = consumoMensalKWh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public float getConsumoMensalKWh() {
        return consumoMensalKWh;
    }

    public void setConsumoMensalKWh(float consumoMensalKWh) {
        this.consumoMensalKWh = consumoMensalKWh;
    }
    
    
    
    }
    
   
   

