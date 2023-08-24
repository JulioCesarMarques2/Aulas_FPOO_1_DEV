/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

/**
 *
 * @author Aluno
 */
public class Cursos {
    private String nome;
    private String descrisao;
    private CursosEnum categoria;

    public Cursos(String nome, String descrisao, CursosEnum categoria) {
        this.nome = nome;
        this.descrisao = descrisao;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Cursos " + "nome = " + nome + ", descrisao = "
                + descrisao + ", categoria = " + categoria;
    }

    
    
    
    
}
