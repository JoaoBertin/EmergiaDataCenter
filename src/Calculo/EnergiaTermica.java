/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

public class EnergiaTermica {
    private double massa; // em kg
    private double capacidadeCalorifica; // em J/kg°C
    private double variacaoTemperatura; // em °C
    private final double transformidade = 1.15; // Transformidade pré-definida em sej (exemplo)

    public EnergiaTermica(double massa, double capacidadeCalorifica, double variacaoTemperatura) {
        this.massa = massa;
        this.capacidadeCalorifica = capacidadeCalorifica;
        this.variacaoTemperatura = variacaoTemperatura;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getCapacidadeCalorifica() {
        return capacidadeCalorifica;
    }

    public void setCapacidadeCalorifica(double capacidadeCalorifica) {
        this.capacidadeCalorifica = capacidadeCalorifica;
    }

    public double getVariacaoTemperatura() {
        return variacaoTemperatura;
    }

    public void setVariacaoTemperatura(double variacaoTemperatura) {
        this.variacaoTemperatura = variacaoTemperatura;
    }

    public double calcularEmergiaTotal() {
        // Energia em J * transformidade
        double energiaDisponivel = massa * capacidadeCalorifica * variacaoTemperatura; // em J
        return energiaDisponivel * transformidade; // aplicando a transformidade
    }

    // Calcular o FTF diretamente com a transformidade fornecida
    public double calcularFTF() {
        double energiaDisponivel = massa * capacidadeCalorifica * variacaoTemperatura;
        return transformidade * energiaDisponivel; // FTF usando o valor de transformidade diretamente
    }
}
