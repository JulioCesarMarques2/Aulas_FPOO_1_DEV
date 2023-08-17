/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public enum EnumMeses {
    JANEIRO("janeiro"), 
    FEVEREIRO("fevereiro"),
    MARCO("marco"),
    ABRIL("abril"),
    MAIO("maio"), 
    JUNHO("junho"), 
    JULHO("julho"),
    AGOSTO("agosto"), 
    SETEMBRO("setembro"), 
    OUTUBRO("outubro"),
    NOVEMBRO("novembro"), 
    DEZEMBRO("dezembro");
    
    private String mes;

    private EnumMeses(String mes){
        this.mes = mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    

    public String getMes() {
        return mes;
    }
    
    
}
