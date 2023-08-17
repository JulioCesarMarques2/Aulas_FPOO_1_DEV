/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade04;

/**
 *
 * @author Aluno
 */
public class enumeracaoSocial {
    public static void main(String[] args) {
        Social social = new Social(EnumSocial.TWITTER.getSocial());
        System.out.println(social);
        social.setRedeSocial(EnumSocial.INSTAGRAM.getSocial());
        System.out.println(social);
        social.setRedeSocial(EnumSocial.FACEBOOK.getSocial());
        System.out.println(social);
    }
    
}
