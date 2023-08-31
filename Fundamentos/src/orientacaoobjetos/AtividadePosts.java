/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class AtividadePosts {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Posts post = new Posts(1, "José Alves",
                "joséalves@gmail.com", PostEnum.COMUM,
                "ABC", "abc");
        System.out.println(post);
        int avaliacaoEstrelas = post.avaliacaoEstrelas(1);
        System.out.println("Avaliação em Estrelas = " + avaliacaoEstrelas);

        Posts post2 = new Posts(3, "Maria Santos",
                "mariasantos@gmail.com", PostEnum.LEGAL,
                "DEF", "def");
        System.out.println(post2);
        int avaliacaoEstrelas2 = post2.avaliacaoEstrelas1(3);
        System.out.println("Avaliação em Estrelas = " + avaliacaoEstrelas2);
        
        Posts post3 = new Posts(5, "Matheus Zamparo",
                "zamparomatheus@gmail.com", PostEnum.SUPER_LEGAL,
                "GHI", "ghi");
        System.out.println(post3);
        int avaliacaoEstrelas3 = post3.avaliacaoEstrelas2(5);
        System.out.println("Avaliação em Estrelas = " + avaliacaoEstrelas3);
    }
}
