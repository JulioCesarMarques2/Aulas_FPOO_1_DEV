/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade02;

/**
 *
 * @author Aluno
 */
public enum EnumLivros {
    LIVRO("Livro1"),
    LIVRO1("Livro2"), 
    LIVROS2("Livros3"), 
    LIVROS3("Livros4"), 
    LIVROS4("Livros5");
    
    private String livro;

    private EnumLivros(String livro) {
        this.livro = livro;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }
    
}
