/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum MarchaEnum {
    PRIMEIRA_MARCHA("Primeira Marcha", 1),
    SEGUNDA_MARCHA("Segunda Marcha", 2),
    TERCEIRA_MARCHA("Terceira Marcha", 3),
    QUARTA_MARCHA("Quarta Marcha", 4),
    QUINTA_MARCHA("Quinta Marcha", 5),
    MARCHA_RE("Marcha Ré", -1),
    NEUTRO("Neutro", 0);
    
    private String marcha;
    private int numeroMarcha;

    private MarchaEnum(String marcha, int numeroMarcha) {
        this.marcha = marcha;
        this.numeroMarcha = numeroMarcha;
    }

    public String getMarcha() {
        return marcha;
    }

    public int getNumeroMarcha() {
        return numeroMarcha;
    }
    
    
}

