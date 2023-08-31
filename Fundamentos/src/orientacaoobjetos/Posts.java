/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

/**
 *
 * @author Aluno
 */
public class Posts implements ClassificacaoPost {

    private int estrelas;
    private String nome1;
    private String email2;
    private PostEnum avaliacaoPost;
    private String titulo;
    private String texto;

    public Posts(int estrelas, String nome1, String email2, PostEnum avaliacaoPost, String titulo, String texto) {
        this.estrelas = estrelas;
        this.nome1 = nome1;
        this.email2 = email2;
        this.avaliacaoPost = avaliacaoPost;
        this.titulo = titulo;
        this.texto = texto;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public String getNome1() {
        return nome1;
    }

    public String getEmail2() {
        return email2;
    }

    public PostEnum getAvaliacaoPost() {
        return avaliacaoPost;
    }

    @Override
    public String toString() {
        return "Posts " + " estrelas = " + estrelas + ", nome1 = "
                + nome1 + ", email2 = " + email2 + ", avaliacaoPost = "
                + avaliacaoPost + " Titulo = " + titulo + " Texto = " + texto;
    }

    public int avaliacaoEstrelas(int estrelas) {
        return estrelas = COMUM;
    }

    public int avaliacaoEstrelas1(int estrelas1) {
        return estrelas1 = LEGAL;
    }

    public int avaliacaoEstrelas2(int estrelas2) {
        return estrelas2 = SUPER_LEGAL;
    }

}
