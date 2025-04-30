/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.DAO.Conexao;
import Model.Usuario;
import java.util.Date;

/**
 *
 * @author davic
 */
public class Main {
    public static void main(String[] args) {
        try{
            
            Conexao a = new Conexao();
            a.getConnection();
            System.out.println("Conectado");
        
        }catch(Exception e){
            System.out.println("Não conectado");
        
        }
        
        
        
        
        
        
        // Criando o objeto Cliente
        Cliente cliente = new Cliente(12345678, "Grande Porte", "Tecnologia da Informação", "Rua Teste", "98583821", 1, "email@teste.com");
        System.out.println(cliente.getEmail());  // Agora funcionará sem erro
        
        // Exemplo de como criar uma data (substitua pela data desejada)
        Date dataNascimento = new Date(92, 5, 15); // Ano 1992, Junho 15 (Data em formato antigo, considere usar um formato moderno)

        // Criando o usuário
        Usuario usuario = new Usuario(0, "email@brabo.com", "123456");

        // Imprimindo o usuário
        System.out.println(usuario.getEmail());  // Agora funcionará sem erro
    }
}


    

