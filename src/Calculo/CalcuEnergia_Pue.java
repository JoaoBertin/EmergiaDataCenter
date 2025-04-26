/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

/**
 *
 * @author davic
 */
public class CalcuEnergia_Pue {
    private String tipoEquipamento;
    private int pontEquipamentos;
    private int horasConsumo;
    private int qtdEquipamentos;
    private int consKwhTi;

    public CalcuEnergia_Pue(String tipoEquipamento, int pontEquipamentos, int horasConsumo, int qtdEquipamentos) {
        this.tipoEquipamento = tipoEquipamento;
        this.pontEquipamentos = pontEquipamentos;
        this.horasConsumo = horasConsumo;
        this.qtdEquipamentos = qtdEquipamentos;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public float getPontEquipamentos() {
        return pontEquipamentos;
    }

    public void setPontEquipamentos(int pontEquipamentos) {
        this.pontEquipamentos = pontEquipamentos;
    }

    public int getHorasConsumo() {
        return horasConsumo;
    }

    public void setHorasConsumo(int horasConsumo) {
        this.horasConsumo = horasConsumo;
    }

    public int getQtdEquipamentos() {
        return qtdEquipamentos;
    }

    public void setQtdEquipamentos(int qtdEquipamentos) {
        this.qtdEquipamentos = qtdEquipamentos;
    }
     
    public int calcuEnergia(){
        return (pontEquipamentos * horasConsumo * qtdEquipamentos)/1000;
}    
    public String toString(){
        return "O equipamento " + tipoEquipamento +  " gastou de energia: " + calcuEnergia() + "kWh";
        
        
    }

    public CalcuEnergia_Pue(int consKwhTi) {
        this.consKwhTi = consKwhTi;
    }

    public int getConsKwhTi() {
        return consKwhTi;
    }

    public void setConsKwhTi(int consKwhTi) {
        this.consKwhTi = consKwhTi;
    }
    
    public float calcuPue(){
        return calcuEnergia()/ consKwhTi;
    }
    
}