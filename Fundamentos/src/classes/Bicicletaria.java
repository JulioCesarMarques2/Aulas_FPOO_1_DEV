/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicletaria {
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 8, "CaloiCross",
                true, CorEnum.ROXO, MarchaEnum.PRIMEIRA_MARCHA.getNumeroMarcha());
        System.out.println(caloiCross);
        
        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);
        
        System.out.println(caloiCross);
        }

}
