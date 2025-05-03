/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

public class EnergiaCombustivelFossil {
    private double volumeConsumido; // em litros
    private double poderCalorifico; // em MJ/litro
    private String tipoCombustivel;
    private double transformidade; // Valor de transformidade baseado no tipo de combustível

    // Construtor
    public EnergiaCombustivelFossil(double volumeConsumido, double poderCalorifico, String tipoCombustivel) {
        this.volumeConsumido = volumeConsumido;
        this.poderCalorifico = poderCalorifico;
        this.tipoCombustivel = tipoCombustivel;
        // Definindo a transformidade com base no tipo de combustível
        if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            this.transformidade = 4.2e4; // Transformidade do diesel
        } else if (tipoCombustivel.equalsIgnoreCase("gas natural")) {
            this.transformidade = 5.4e4; // Transformidade do gás natural
        } else {
            this.transformidade = 0; // Valor padrão se o tipo for inválido
        }
    }

    public double getVolumeConsumido() {
        return volumeConsumido;
    }

    public void setVolumeConsumido(double volumeConsumido) {
        this.volumeConsumido = volumeConsumido;
    }

    public double getPoderCalorifico() {
        return poderCalorifico;
    }

    public void setPoderCalorifico(double poderCalorifico) {
        this.poderCalorifico = poderCalorifico;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcularEmergiaTotal() {
        // Energia em MJ * transformidade
        double energiaDisponivel = volumeConsumido * poderCalorifico; // em MJ
        return energiaDisponivel * transformidade; // aplicando a transformidade
    }

    // Calcular o FTF diretamente com a transformidade fornecida
    public double calcularFTF() {
        double energiaDisponivel = volumeConsumido * poderCalorifico;
        return transformidade * energiaDisponivel; // FTF usando o valor de transformidade diretamente
    }
}
