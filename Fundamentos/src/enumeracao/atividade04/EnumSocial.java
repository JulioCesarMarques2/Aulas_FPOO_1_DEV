/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade04;

/**
 *
 * @author Aluno
 */
public enum EnumSocial {
    TWITTER("Twitter"),
    INSTAGRAM("Instagram"),
    FACEBOOK("Facebook");
    private String social;

    private EnumSocial(String social) {
        this.social = social;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }
    
}
