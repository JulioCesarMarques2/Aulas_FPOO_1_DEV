/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

/**
 *
 * @author Aluno
 */
public class Sala {

    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int numeroComputador;
    private String situacao;

    public Sala(int numeroCadeiras, int numeroMesas, int numeroSala, boolean temProjetor, int numeroComputador, String situacao) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputador = numeroComputador;
        this.situacao = "Estudando";

    }

    public void aula(String situacao) {
        System.out.println("Ocupada");
        this.situacao = "Em Aula";
        
    }
    public void prova(String situacao) {
        System.out.println("Realizando Prova");
        this.situacao = "Fazendo prova";
}

    @Override
    public String toString() {
        return "Sala " + "numeroCadeiras = " + numeroCadeiras + ", numeroMesas = "
                + numeroMesas + ", numeroSala = " + numeroSala + ", temProjetor = "
                + temProjetor + ", numeroComputador = " + numeroComputador + ", situacao = " + situacao;
    }

}
