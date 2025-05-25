
package Calculo;
// Classe responsável por calcular a emergia associada ao uso de Materiais na produção do Data Center
public class EnergiaIncorporadaMateriais {
    // Atributos principais da classe
    private double massa; // em kg
    private String tipoMaterial;
    private double energiaEspecifica; // em MJ/kg
    private double transformidade; // seJ/MJ

    public EnergiaIncorporadaMateriais(double massa, String tipoMaterial) {
        this.massa = massa;
        this.tipoMaterial = tipoMaterial;

        switch (tipoMaterial) {
            case "Concreto Armado":
                energiaEspecifica = 1.69;
                transformidade = 2.5e9;
                break;
            case "Aço Estrutural":
                energiaEspecifica = 30.0;
                transformidade = 1.2e10;
                break;
            case "Aço Laminado":
                energiaEspecifica = 30.0;
                transformidade = 1.2e10;
                break;
            case "Alumínio":
                energiaEspecifica = 192.0;
                transformidade = 2.0e10;
                break;
            case "Cobre":
                energiaEspecifica = 42.0;
                transformidade = 1.8e10;
                break;
            case "Plástico":
                energiaEspecifica = 85.0;
                transformidade = 8.0e9;
                break;
            case "Silício":
                energiaEspecifica = 1200.0; // média entre 1000 e 1500 MJ/kg
                transformidade = 3.0e11;
                break;
            case "Fibra de Vidro":
                energiaEspecifica = 28.0;
                transformidade = 6.5e9;
                break;
            case "Resina":
                energiaEspecifica = 90.0; // valor médio para poliéster/epóxi
                transformidade = 6.5e9;
                break;
            case "Vidro Temperado":
                energiaEspecifica = 15.0;
                transformidade = 4.2e9;
                break;
            case "Isolamento Térmico":
                energiaEspecifica = 28.0; // lã de vidro como referência
                transformidade = 5.0e9;
                break;
            case "Água Tratada":
                energiaEspecifica = 0.02; // 0.02 MJ/kg (≈20 MJ/m³)
                transformidade = 1.0e8;
                break;
            default:
                energiaEspecifica = 0;
                transformidade = 0;
                break;
        }
    }

    // Cálculo da energia incorporada (MJ)
    public double calcularEnergiaIncorporada() {
        return massa * energiaEspecifica;
    }

    // Cálculo da emergia incorporada (seJ)
    public double calcularEmergiaIncorporada() {
        return calcularEnergiaIncorporada() * transformidade;
    }

    // Getters e Setters
    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
        // Recalcula se necessário
    }

    public double getEnergiaEspecifica() {
        return energiaEspecifica;
    }

    public double getTransformidade() {
        return transformidade;
    }
}
