/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade02;

/**
 *
 * @author Aluno
 */
public class Livros {
    private String livros;

    public Livros(String livros) {
        this.livros = livros;
    }

    public String getLivros() {
        return livros;
    }

    public void setLivros(String livros) {
        this.livros = livros;
    }
    

    @Override
    public String toString() {
        return "livros = " + livros;
    }
    
    
}
