/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Usuario;
import java.util.Date;

/**
 *
 * @author davic
 */
public class Main {
    public static void main(String[] args) {
        // Criando o objeto Cliente
        Cliente cliente = new Cliente(123456780, "Grande Porte", "Tecnologia da Informação", 
                                      "Av. Paulista, 1000", "01310-100", 1, 
                                      "contato@empresa.com", "EcoData Center Ltda", "senhaSegura123");
        System.out.println(cliente);  // Agora funcionará sem erro
        
        // Exemplo de como criar uma data (substitua pela data desejada)
        Date dataNascimento = new Date(92, 5, 15); // Ano 1992, Junho 15 (Data em formato antigo, considere usar um formato moderno)

        // Criando o usuário
        Usuario usuario = new Usuario("João Silva", 1, 'M', dataNascimento, 123456789, 987654321, 
                                      1, "joao.silva@empresa.com", "Empresa XYZ", "senhaSegura123");

        // Imprimindo o usuário
        System.out.println(usuario);  // Agora funcionará sem erro
    }
}


    

