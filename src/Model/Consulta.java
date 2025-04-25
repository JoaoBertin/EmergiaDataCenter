/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hide
 */
public class Consulta {
    private int id;
    private Cliente cliente;
    private DataCenter datacenter;
    private float consumoMensalKWh;

    public Consulta(int id, Cliente cliente, DataCenter datacenter, float consumoMensalKWh) {
        this.id = id;
        this.cliente = cliente;
        this.datacenter = datacenter;
        this.consumoMensalKWh = consumoMensalKWh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DataCenter getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(DataCenter datacenter) {
        this.datacenter = datacenter;
    }

    public float getConsumoMensalKWh() {
        return consumoMensalKWh;
    }

    public void setConsumoMensalKWh(float consumoMensalKWh) {
        this.consumoMensalKWh = consumoMensalKWh;
    }
    
}
