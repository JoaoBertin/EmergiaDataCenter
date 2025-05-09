/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

public class EnergiaCombustivelFossil {
    private double volumeConsumido; // em litros
    private double poderCalorifico; // em MJ/litro
    private double transformidade; // sej/MJ
    private String tipoCombustivel;

    
    public EnergiaCombustivelFossil(double volumeConsumido, double poderCalorifico1, String tipoCombustivel) {
        this.volumeConsumido = volumeConsumido;
        this.tipoCombustivel = tipoCombustivel.toLowerCase();

        switch (this.tipoCombustivel) {
            case "diesel":
                this.poderCalorifico = 36.55;
                this.transformidade = 6.6e4;
                break;
            case "gás natural":
                this.poderCalorifico = 36.66;
                this.transformidade = 4.8e4;
                break;
            case "hvo":
                this.poderCalorifico = 34.32;
                this.transformidade = 1.24e5;
                break;
            default:
                this.poderCalorifico = 0;
                this.transformidade = 0;
                break;
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

    public double getTransformidade() {
        return transformidade;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    
    public double calcularEmergiaTotal() {
        double energiaDisponivel = volumeConsumido * poderCalorifico;
        return energiaDisponivel * transformidade;
    }

    
    public double calcularFTFCombustivel() {
        return calcularEmergiaTotal();
    }
}
