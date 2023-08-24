/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Garagem {
    public static void main(String[] args) {
        Carro carro = new Carro("Nissan", "Preto", 4, 2005, "Uno");
        carro.toString();
        System.out.println(carro);
        carro.andar(10);
        carro.andar(20);
        carro.andar(30);
        System.out.println(carro);
    }
    
}
