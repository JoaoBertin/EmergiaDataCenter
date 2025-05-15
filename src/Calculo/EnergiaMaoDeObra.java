/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

import javax.swing.JOptionPane;

public class EnergiaMaoDeObra {
    private String trabalho;
    private int numeroTrabalhadores;
    private int horasTrabalhadas;
    private int diasTrabalhados;
    private double energiaMediaHora = 1.2; // em MJ/h
    private final double transformidade = 3.12e6; // Transformidade pré-definida em sej (exemplo)

    public EnergiaMaoDeObra(String trabalho, int numeroTrabalhadores, int horasTrabalhadas, int diasTrabalhados) {
        this.trabalho = trabalho;
        this.numeroTrabalhadores = numeroTrabalhadores;
        this.horasTrabalhadas = horasTrabalhadas;
        this.diasTrabalhados = diasTrabalhados;
          switch (trabalho){
               case "Técnico em Redes":
                this.energiaMediaHora = 16_200_000;
                break;
            case "Técnico de TI":
                this.energiaMediaHora = 54_000_000;
                break;
            case "Eng. Elétrico / Téc. Eletrotécnico":
                this.energiaMediaHora = 12_600_000;
                break;
            case "Analista de Cibersegurança":
                this.energiaMediaHora = 41_400_000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Profissão inválida! Transformidade será 0.");
                this.energiaMediaHora = 0;
                break;
          }
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
        double energiaDisponivel = numeroTrabalhadores * horasTrabalhadas * energiaMediaHora;
        return energiaDisponivel * transformidade;
    }

    public double calcularFTFMaoDeObra() {
        double energiaDisponivel = numeroTrabalhadores * horasTrabalhadas * diasTrabalhados * energiaMediaHora;
        return energiaDisponivel * transformidade;
    }
}




