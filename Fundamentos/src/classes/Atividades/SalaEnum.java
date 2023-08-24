/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

/**
 *
 * @author Aluno
 */
public class SalaEnum {
    public static void main(String[] args) {
        Sala sala = new Sala(32, 32, 307, true, 32, "Aula");
        System.out.println(sala);
        sala.aula("Aula");
        sala.prova("Prova");
    }
    
}
