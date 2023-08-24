/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

/**
 *
 * @author Aluno
 */
public enum ProcessadorEnum {
    INTEL_15("Intel 15"),
    INTEL_17("Intel 17"),
    INTEL_19("Intel 19");
    
    private String intel;

    private ProcessadorEnum(String intel) {
        this.intel = intel;
    }

    public String getIntel() {
        return intel;
    }
    
}
