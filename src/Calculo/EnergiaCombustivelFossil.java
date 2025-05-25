
package Calculo;


public class EnergiaCombustivelFossil {
    private double volumeConsumido;     // em litros
    private double poderCalorifico;     // MJ/L
    private double transformidade;      // seJ/MJ
    private String tipoCombustivel;

    public EnergiaCombustivelFossil(double volumeConsumido, String tipoCombustivel) {
        this.volumeConsumido = volumeConsumido;
        this.tipoCombustivel = tipoCombustivel.toUpperCase(); // Usa maiúsculo

        // Define os valores de acordo com o combustível selecionado
        switch (this.tipoCombustivel) {
            case "DIESEL":
                this.poderCalorifico = 36.55;
                this.transformidade = 6.6e4;
                break;
            case "GÁS NATURAL":
                this.poderCalorifico = 36.66;
                this.transformidade = 4.8e4;
                break;
            case "HVO":
                this.poderCalorifico = 34.32;
                this.transformidade = 1.24e5;
                break;
            default:
                this.poderCalorifico = 0;
                this.transformidade = 0;
                break;
        }
    }

    public double calcularEmergiaTotal() {
        double energiaDisponivel = volumeConsumido * poderCalorifico;
        return energiaDisponivel * transformidade;
    }

    // Getters (opcional)
    public double getTransformidade() {
        return transformidade;
    }

    public double getPoderCalorifico() {
        return poderCalorifico;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getVolumeConsumido() {
        return volumeConsumido;
    }
}
