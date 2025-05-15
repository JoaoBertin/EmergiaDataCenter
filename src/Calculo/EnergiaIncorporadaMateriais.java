/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;


public class EnergiaIncorporadaMateriais {
     private double massa;
    private String tipoMaterial;
    private double transformidade;

    public EnergiaIncorporadaMateriais(double massa, String tipoMaterial) {
        this.massa = massa;
        this.tipoMaterial = tipoMaterial.toLowerCase();
        definirTransformidade();
    }

    private void definirTransformidade() {
        switch (tipoMaterial) {
            case "concreto armado":
                transformidade = 2.5e9;
                break;
            case "aço estrutural":
            case "aço laminado":
                transformidade = 1.2e10;
                break;
            case "alumínio":
                transformidade = 2.0e10;
                break;
            case "cobre":
                transformidade = 1.8e10;
                break;
            case "plásticos":
            case "pvc":
            case "pe":
            case "pu":
                transformidade = 8.0e9;
                break;
            case "silício":
                transformidade = 3.0e11;
                break;
            case "fibra de vidro":
            case "resina":
            case "fr4":
                transformidade = 6.5e9;
                break;
            case "vidro temperado":
                transformidade = 4.2e9;
                break;
            case "isolamento térmico":
                transformidade = 5.0e9;
                break;
            case "fluidos refrigerantes":
            case "água tratada":
                transformidade = 1.0e8;
                break;
            default:
                transformidade = 0;
                break;
        }
    }

    public double calcularEmergiaIncorporada() {
        return massa * transformidade;
    }

    public double getMassa() {
        return massa;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public double getTransformidade() {
        return transformidade;
    }
}


