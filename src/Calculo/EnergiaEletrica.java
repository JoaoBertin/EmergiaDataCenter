
package Calculo;

import javax.swing.JOptionPane;
// Classe responsável por calcular a emergia associada ao uso de Energia Elétrica e seus dispositivos
public class EnergiaEletrica {
    // Atributos principais da classe
    private String dispositivo;           // Nome do equipamento (ex: servidor, roteador)
    private double potenciaKwh;           // Potência do equipamento em kWh
    private double horasOperacao;         // Horas que o equipamento funciona por dia
    private int diasOperacao;             // Quantidade de dias de operação
    private double transformidade;        // Transformidade (seJ/J) - define a conversão de energia para emergia

    // Construtor da classe
    public EnergiaEletrica(String dispositivo, double potenciaKwh, double horasOperacao, int diasOperacao) {
        this.dispositivo = dispositivo;
        this.potenciaKwh = potenciaKwh;
        this.horasOperacao = horasOperacao;
        this.diasOperacao = diasOperacao;
        this.transformidade = transformidade;

        // Define a transformidade com base no tipo de dispositivo
        switch (dispositivo) {
            case "Servidores":
            case "Switches":
            case "Roteadores":
            case "Firewalls":
            case "Access Points (APs)":
            case "Fontes de Alimentação (UPS)":
            case "Sistema de Monitoramento":
            case "Ar condicionado":
            case "Sistema de Resfriamento Líquido":
            case "Sistema Incêndio":
                this.transformidade = 1.74e5; // Valor padrão para todos os dispositivos (pode ser ajustado futuramente)
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dispositivo não reconhecido.");
                this.dispositivo = "Desconhecido";
                this.transformidade = 0; // Se não for reconhecido, não calcula emergia
                break;
        }
    }

    // Getters e Setters (acesso às variáveis da classe)
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

    // Método que calcula a emergia total (em seJ) consumida pelo dispositivo
    public double calcularEmergiaTotal() {
        // Converte energia de kWh para Joules: 1 kWh = 3600 kJ = 3.6e6 J
        double energiaDisponivel = (potenciaKwh * horasOperacao * diasOperacao) * 3600;
        return energiaDisponivel * transformidade;
    }

    // Método FTF 
    public double calcularFTFEnEletrica() {
        return calcularEmergiaTotal();
    }
}

