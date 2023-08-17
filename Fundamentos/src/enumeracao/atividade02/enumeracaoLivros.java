/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade02;

/**
 *
 * @author Aluno
 */
public class enumeracaoLivros {

    public static void main(String[] args) {
        Livros livros = new Livros(EnumLivros.LIVRO.getLivro());
        System.out.println(livros);
        livros.setLivros(EnumLivros.LIVRO1.getLivro());
        System.out.println(livros);
        livros.setLivros(EnumLivros.LIVROS2.getLivro());
        System.out.println(livros);
        livros.setLivros(EnumLivros.LIVROS3.getLivro());
        System.out.println(livros);
        livros.setLivros(EnumLivros.LIVROS4.getLivro());
        System.out.println(livros);

    }
}
