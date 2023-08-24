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
        Carro UNO = new Carro("UNO", CorEnum.ROXO, 7, 2005,
                "NISSAN", true, 0);
        UNO.trocarMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        UNO.trocarMarcha(MarchaEnum.SEGUNDA_MARCHA);
        UNO.trocarMarcha(MarchaEnum.TERCEIRA_MARCHA);
        UNO.trocarMarcha(MarchaEnum.QUARTA_MARCHA);
        System.out.println(UNO);
    }
}
    
