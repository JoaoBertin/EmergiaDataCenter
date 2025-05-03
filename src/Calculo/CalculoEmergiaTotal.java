/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

public class CalculoEmergiaTotal {
    
    // Atributos para armazenar os cálculos de energia e transformidade
    private double energiaEletricaTotal;
    private double energiaMaoDeObraTotal;
    private double energiaCombustiveisTotal;
    private double energiaTermicaTotal;
    
    // Atributos para os FTFs correspondentes
    private double FTF_Eletrica = 1.6e5;  // Transformidade para elétrica
    private double FTF_MaoDeObra = 1.6e6; // Transformidade para mão de obra
    private double FTF_Combustiveis = 4.2e4; // Transformidade para combustíveis fósseis (diesel)
    private double FTF_Termica = 1.8e4; // Transformidade para energia térmica (exemplo de madeira)

    // Construtor
    public CalculoEmergiaTotal(double energiaEletricaTotal, double energiaMaoDeObraTotal, 
                                double energiaCombustiveisTotal, double energiaTermicaTotal) {
        this.energiaEletricaTotal = energiaEletricaTotal;
        this.energiaMaoDeObraTotal = energiaMaoDeObraTotal;
        this.energiaCombustiveisTotal = energiaCombustiveisTotal;
        this.energiaTermicaTotal = energiaTermicaTotal;
    }

    // Métodos Getters e Setters
    public double getEnergiaEletricaTotal() {
        return energiaEletricaTotal;
    }

    public void setEnergiaEletricaTotal(double energiaEletricaTotal) {
        this.energiaEletricaTotal = energiaEletricaTotal;
    }

    public double getEnergiaMaoDeObraTotal() {
        return energiaMaoDeObraTotal;
    }

    public void setEnergiaMaoDeObraTotal(double energiaMaoDeObraTotal) {
        this.energiaMaoDeObraTotal = energiaMaoDeObraTotal;
    }

    public double getEnergiaCombustiveisTotal() {
        return energiaCombustiveisTotal;
    }

    public void setEnergiaCombustiveisTotal(double energiaCombustiveisTotal) {
        this.energiaCombustiveisTotal = energiaCombustiveisTotal;
    }

    public double getEnergiaTermicaTotal() {
        return energiaTermicaTotal;
    }

    public void setEnergiaTermicaTotal(double energiaTermicaTotal) {
        this.energiaTermicaTotal = energiaTermicaTotal;
    }

    // Método para calcular a emergia total
    public double calcularEmergiaTotal() {
        double emergiaTotal = (energiaEletricaTotal * FTF_Eletrica) +
                              (energiaMaoDeObraTotal * FTF_MaoDeObra) +
                              (energiaCombustiveisTotal * FTF_Combustiveis) +
                              (energiaTermicaTotal * FTF_Termica);
        return emergiaTotal;
    }

}
