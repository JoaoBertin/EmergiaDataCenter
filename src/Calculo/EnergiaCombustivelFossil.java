package Calculo;

// Classe responsável por calcular a emergia associada ao uso de combustíveis fósseis
public class EnergiaCombustivelFossil {
    // Atributos principais da classe
    private double volumeConsumido;     // Volume de combustível consumido em litros
    private double poderCalorifico;     // Quantidade de energia por litro (MJ/litro)
    private double transformidade;      // Valor de conversão de energia para emergia (seJ/MJ)
    private String tipoCombustivel;     // Tipo do combustível utilizado

    // Construtor: recebe o volume e o tipo de combustível escolhido pelo usuário
    public EnergiaCombustivelFossil(double volumeConsumido, String tipoCombustivel) {
        this.volumeConsumido = volumeConsumido;
        
        // Converte para maiúsculas para evitar erros de comparação
        this.tipoCombustivel = tipoCombustivel.toUpperCase();

        // Define o poder calorífico e a transformidade com base no combustível
        switch (this.tipoCombustivel) {
            case "DIESEL":
                this.poderCalorifico = 36.55;    // energia por litro (MJ/L)
                this.transformidade = 6.6e4;     // sej/MJ
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
                // Se o tipo informado não for reconhecido
                this.poderCalorifico = 0;
                this.transformidade = 0;
                break;
        }
    }

    // Método que calcula a emergia total com base no volume e poder calorífico
    public double calcularEmergiaTotal() {
        double energiaDisponivel = volumeConsumido * poderCalorifico; // MJ
        return energiaDisponivel * transformidade; // seJ
    }

    // Métodos de acesso (Getters)
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
