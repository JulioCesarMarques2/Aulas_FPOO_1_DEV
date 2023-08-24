/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

/**
 *
 * @author Aluno
 */
public class Computador {
    private ComputadorEnum memoria;
    private ProcessadorEnum processador;
    private int discoRigido;
    private String sistemaOperacional;

    public Computador(ComputadorEnum memoria, ProcessadorEnum processador, int discoRigido, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.discoRigido = discoRigido;
        this.sistemaOperacional = sistemaOperacional;
    }

    public ComputadorEnum getMemoria(ComputadorEnum memoria) {
        System.out.println("A memoria e ");
        this.memoria = memoria;
        return memoria;
    }

    public ProcessadorEnum getProcessador(ProcessadorEnum processador) {
        System.out.println("O processador e ");
        this.processador = processador;
        return processador;
    }

    
    @Override
    public String toString() {
        return "Computador " + "memoria = " + memoria + ", processador = "
                + processador + ", discoRigido = " + discoRigido + ", sistemaOperacional = "
                + sistemaOperacional;
    }
    
    
    
}
