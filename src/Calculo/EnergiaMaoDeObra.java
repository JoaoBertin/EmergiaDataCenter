/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

public class EnergiaMaoDeObra {
    private int numeroTrabalhadores;
    private int horasTrabalhadas;
    private double energiaMediaHora; // em MJ/h
    private final double transformidade = 1.15; // Transformidade pré-definida em sej (exemplo)

    public EnergiaMaoDeObra(int numeroTrabalhadores, int horasTrabalhadas, double energiaMediaHora) {
        this.numeroTrabalhadores = numeroTrabalhadores;
        this.horasTrabalhadas = horasTrabalhadas;
        this.energiaMediaHora = energiaMediaHora;
    }

    public int getNumeroTrabalhadores() {
        return numeroTrabalhadores;
    }

    public void setNumeroTrabalhadores(int numeroTrabalhadores) {
        this.numeroTrabalhadores = numeroTrabalhadores;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getEnergiaMediaHora() {
        return energiaMediaHora;
    }

    public void setEnergiaMediaHora(double energiaMediaHora) {
        this.energiaMediaHora = energiaMediaHora;
    }

    public double calcularEmergiaTotal() {
        // Energia em MJ * transformidade
        double energiaDisponivel = numeroTrabalhadores * horasTrabalhadas * energiaMediaHora; // em MJ
        return energiaDisponivel * transformidade; // aplicando a transformidade
    }

    // Calcular o FTF diretamente com a transformidade fornecida
    public double calcularFTF() {
        double energiaDisponivel = numeroTrabalhadores * horasTrabalhadas * energiaMediaHora;
        return transformidade * energiaDisponivel; // FTF usando o valor de transformidade diretamente
    }
}
