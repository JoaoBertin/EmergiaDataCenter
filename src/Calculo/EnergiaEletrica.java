/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

public class EnergiaEletrica {
    private double potenciaKwh;
    private double horasOperacao;
    private int diasOperacao;
    private final double transformidade = 1.74e5; /*(exemplo)*/

    public EnergiaEletrica(double potenciaKwh, double horasOperacao, int diasOperacao) {
        this.potenciaKwh = potenciaKwh;
        this.horasOperacao = horasOperacao;
        this.diasOperacao = diasOperacao;
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

    public int getDiasOperacao() {
        return diasOperacao;
    }

    public void setDiasOperacao(int diasOperacao) {
        this.diasOperacao = diasOperacao;
    }
   
    public double calcularEmergiaTotal() {
        double energiaDisponivel = ((potenciaKwh * horasOperacao)*diasOperacao) * 3600;
        return energiaDisponivel * transformidade; // aplicando a transformidade
    }

    // Calcular o FTF diretamente com a transformidade fornecida
    public double calcularFTFEnEletrica() {
        double energiaDisponivel = ((potenciaKwh * horasOperacao)*diasOperacao) * 3600;
        return transformidade * energiaDisponivel; // FTF usando o valor de transformidade diretamente
    }
}
