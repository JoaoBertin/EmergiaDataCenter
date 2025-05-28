package Calculo;

import javax.swing.JOptionPane;

// Classe responsável por calcular a emergia associada à Mão de Obra humana
public class EnergiaMaoDeObra {
    // Atributos principais da classe
    private String trabalho;                // Profissão do trabalhador
    private int numeroTrabalhadores;       // Quantidade de trabalhadores
    private int horasTrabalhadas;          // Horas trabalhadas por dia
    private int diasTrabalhados;           // Dias de operação
    private double energiaMediaHora = 1.2; // Energia média por hora em MJ (valor padrão)
    private final double transformidade = 3.12e6; // Transformidade fixa (seJ por MJ)

    // Construtor: recebe os dados e define a energia média por hora com base na profissão
    public EnergiaMaoDeObra(String trabalho, int numeroTrabalhadores, int horasTrabalhadas, int diasTrabalhados) {
        this.trabalho = trabalho;
        this.numeroTrabalhadores = numeroTrabalhadores;
        this.horasTrabalhadas = horasTrabalhadas;
        this.diasTrabalhados = diasTrabalhados;

        // Define energia média por hora conforme a profissão selecionada
        switch (trabalho) {
            case "Técnico em Redes":
                this.energiaMediaHora = 16_200_000; // 4500 W * 3600 s
                break;
            case "Técnico de TI":
                this.energiaMediaHora = 54_000_000; // 15000 W * 3600 s
                break;
            case "Eng. Elétrico / Téc. Eletrotécnico":
                
                break;
            case "Analista de Cibersegurança":
                this.energiaMediaHora = 41_400_000; // 11500 W * 3600 s
                break;
            default:
                JOptionPane.showMessageDialog(null, "Profissão inválida! Transformidade será 0.");
                this.energiaMediaHora = 0;
                break;
        }
    }

    // Getters e Setters
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

    // Calcula a emergia total para um dia de trabalho (sem considerar os dias)
    public double calcularEmergiaTotal() {
        double energiaDisponivel = numeroTrabalhadores * horasTrabalhadas * energiaMediaHora;
        return energiaDisponivel * transformidade;
    }

   
    }







