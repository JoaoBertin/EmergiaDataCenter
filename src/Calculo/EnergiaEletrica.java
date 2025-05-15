/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

import javax.swing.JOptionPane;

public class EnergiaEletrica {
    private String dispositivo;
    private double potenciaKwh;
    private double horasOperacao;
    private int diasOperacao;
    private double transformidade;

    public EnergiaEletrica(String dispositivo, double potenciaKwh, double horasOperacao, int diasOperacao) {
        this.dispositivo = dispositivo;
        this.potenciaKwh = potenciaKwh;
        this.horasOperacao = horasOperacao;
        this.diasOperacao = diasOperacao;
        this.transformidade = transformidade;
        
        switch (dispositivo){
             case "Servidores":
                this.transformidade = 1.74e5;
                break;
            case "Switches":
                this.transformidade = 1.74e5;
                break;
            case "Roteadores":
                this.transformidade = 1.74e5;
                break;
            case "Firewalls":
                this.transformidade = 1.74e5;
                break;
            case "Access Points (APs)":
                this.transformidade = 1.74e5;
                break;
            case "Fontes de Alimentação (UPS)":
                this.transformidade = 1.74e5;
                break;
            case "Sistema de Monitoramento":
                this.transformidade = 1.74e5;
                break;
            case "Ar condicionado":
                this.transformidade = 1.74e5;
                break;
            case "Sistema de Resfriamento Líquido":
                this.transformidade = 1.74e5;
                break;
                case "Sistema Incêndio":
                this.transformidade = 1.74e5;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dispositivo não reconhecido.");
                this.dispositivo = "Desconhecido";
                this.transformidade = 0;
                break;
        
        }
    }

    

    // Getters
    public String getDispositivo() {
        return dispositivo;
    }

    public double getPotenciaKwh() {
        return potenciaKwh;
    }

    public double getHorasOperacao() {
        return horasOperacao;
    }

    public int getDiasOperacao() {
        return diasOperacao;
    }

    public double getTransformidade() {
        return transformidade;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void setPotenciaKwh(double potenciaKwh) {
        this.potenciaKwh = potenciaKwh;
    }

    public void setHorasOperacao(double horasOperacao) {
        this.horasOperacao = horasOperacao;
    }

    public void setDiasOperacao(int diasOperacao) {
        this.diasOperacao = diasOperacao;
    }

    public void setTransformidade(double transformidade) {
        this.transformidade = transformidade;
    }
    

    // Cálculo da emergia total do dispositivo
    public double calcularEmergiaTotal() {
        double energiaDisponivel = (potenciaKwh * horasOperacao * diasOperacao) * 3600; // kWh para Joules
        return energiaDisponivel * transformidade;
    }

    // Cálculo do FTF (também com transformidade, se aplicável)
    public double calcularFTFEnEletrica() {
        return calcularEmergiaTotal(); // Mesmo cálculo por enquanto
    }
}
