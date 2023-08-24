/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

/**
 *
 * @author Aluno
 */
public enum ComputadorEnum {

    MEMORIA_1("2GB"),
    MEMORIA_2("4GB"),
    MEMORIA_3("8GB");

    private String memoria;

    private ComputadorEnum(String memoria) {
        this.memoria = memoria;
    }

    public String getMemoria() {
        return memoria;
    }

}
