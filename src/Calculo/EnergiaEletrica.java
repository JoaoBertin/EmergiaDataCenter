/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

public class EnergiaEletrica {
    private double potenciaKwh;
    private double horasOperacao;
    private final double transformidade = 1.15; // Transformidade pré-definida em sej (exemplo)

    public EnergiaEletrica(double potenciaKwh, double horasOperacao) {
        this.potenciaKwh = potenciaKwh;
        this.horasOperacao = horasOperacao;
    }

    public double getPotenciaKwh() {
        return potenciaKwh;
    }

    public void setPotenciaKwh(double potenciaKwh) {
        this.potenciaKwh = potenciaKwh;
    }

    public double getHorasOperacao() {
        return horasOperacao;
    }

    public void setHorasOperacao(double horasOperacao) {
        this.horasOperacao = horasOperacao;
    }

    public double calcularEmergiaTotal() {
        // Convertendo kWh para joules e considerando a transformidade
        double energiaDisponivel = potenciaKwh * horasOperacao * 3600; // em joules
        return energiaDisponivel * transformidade; // aplicando a transformidade
    }

    // Calcular o FTF diretamente com a transformidade fornecida
    public double calcularFTF() {
        double energiaDisponivel = potenciaKwh * horasOperacao * 3600;
        return transformidade * energiaDisponivel; // FTF usando o valor de transformidade diretamente
    }
}
