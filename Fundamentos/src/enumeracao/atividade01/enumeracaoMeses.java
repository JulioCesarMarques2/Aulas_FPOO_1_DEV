/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public class enumeracaoMeses {
    public static void main(String[] args) {
        Meses meses = new Meses(EnumMeses.JANEIRO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.FEVEREIRO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.MARCO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.ABRIL.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.MAIO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.JUNHO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.JULHO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.AGOSTO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.SETEMBRO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.OUTUBRO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.NOVEMBRO.getMes());
        System.out.println(meses);
        meses.setMeses(EnumMeses.DEZEMBRO.getMes());
        System.out.println(meses);
    }
    
    
}
