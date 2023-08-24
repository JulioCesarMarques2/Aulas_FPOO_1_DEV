/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jorgin", "Jorjin@gmail.com", 616519);
        aluno.toString();
        System.out.println(aluno);
        aluno.estudar("Fazendo licao");
        System.out.println(aluno);
        aluno.prova("fazendo prova");
        System.out.println(aluno);
    }
    
}
