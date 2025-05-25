
package Calculo;
// Classe responsável por calcular a emergia associada à Energia Térmica
public class EnergiaTermica {
// Atributos principais da classe
    private double potenciaTI = 0;        // kW - Equipamentos de TI
    private double iluminacao;        // kW - Iluminação
    private int numPessoas;           // Número de pessoas no ambiente
    private double cargaTotalKW;      // Resultado da carga térmica total
    private double PERDA_UPS = 0.05;     // 5% fixo de perda
    private double POTENCIA_POR_PESSOA = 0.15; // 150W = 0.15kW
    private double COP = 3.5;             // Coeficiente fixo
    private double Tranformidade = 1.74e5; // seJ/J

    // Construtor
    public EnergiaTermica(double iluminacao, int numPessoas) {
        this.iluminacao = iluminacao;
        this.numPessoas = numPessoas;
        this.cargaTotalKW = calcularCargaTermica();
    }

    // Cálculo da carga térmica total
    public double calcularCargaTermica() {
        double cargaUPS = potenciaTI * PERDA_UPS;
        double cargaPessoas = numPessoas * POTENCIA_POR_PESSOA;
        return potenciaTI + iluminacao + cargaUPS + cargaPessoas;
    }

    // Energia elétrica da refrigeração (kW)
    public double calcularEnergiaRefrigeracaoKW() {
        return cargaTotalKW / COP;
    }

    // Conversão para Joules
    public double calcularEnergiaRefrigeracaoJoules() {
        return calcularEnergiaRefrigeracaoKW() * 3600;
    }

    // Emergia térmica (seJ)
    public double calcularEmergiaRefrigeracao() {
        return calcularEnergiaRefrigeracaoJoules() * Tranformidade;
    }

    // Getters
    public double getCargaTotalKW() {
        return cargaTotalKW;
    }

    public double getCOP() {
        return COP;
    }

    public double getTransformidade() {
        return Tranformidade;
    }
}


