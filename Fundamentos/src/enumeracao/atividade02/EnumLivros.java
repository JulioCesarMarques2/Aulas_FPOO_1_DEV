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
    LIVRO("Drama"),
    LIVRO1("Suspence"), 
    LIVROS2("Romance"), 
    LIVROS3("Aventura"), 
    LIVROS4("Poesia");
    
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
