/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

public class EnergiaMaoDeObra {
    private int numeroTrabalhadores;
    private int horasTrabalhadas;
    private int diasTrabalhados;
    private double energiaMediaHora = 1.2; // em MJ/h
    private final double transformidade = 3.12e6; // Transformidade pré-definida em sej (exemplo)

    public EnergiaMaoDeObra(int numeroTrabalhadores, int horasTrabalhadas, int diasTrabalhados, double energiaMediaHora) {
        this.numeroTrabalhadores = numeroTrabalhadores;
        this.horasTrabalhadas = horasTrabalhadas;
        this.diasTrabalhados = diasTrabalhados;
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

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
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
    public double calcularFTFMãoDeObra() {
        double energiaDisponivel = ((numeroTrabalhadores * horasTrabalhadas) * diasTrabalhados) * energiaMediaHora;
        return transformidade * energiaDisponivel; // FTF usando o valor de transformidade diretamente
    }
}
