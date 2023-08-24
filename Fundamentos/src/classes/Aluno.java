/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String email;
    private int RA;
    private String situacao;

    public Aluno(String nome, String email, int RA) {
        this.nome = nome;
        this.email = email;
        this.RA = RA;
        this.situacao = "Estudando";
        
    }
    public void estudar(String situacao) {
        System.out.println("Realizando Atividades");
        this.situacao = "Fazendo Licao";
}
    public void prova(String situacao) {
        System.out.println("Realizando Prova");
        this.situacao = "Fazendo prova";
}

    @Override
    public String toString() {
        return "Aluno " + "nome = " + nome + ", email = " + email + ", RA = " + RA + ", situacao = " + situacao;
    }
    
    
    
}
