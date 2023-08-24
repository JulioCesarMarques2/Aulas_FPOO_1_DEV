/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividades;

/**
 *
 * @author Aluno
 */
public class PC {

    public static void main(String[] args) {
        Computador pc = new Computador(ComputadorEnum.MEMORIA_1,
                ProcessadorEnum.INTEL_15, 1000,
                "Windows 10");
        System.out.println(pc);
        Computador cp = new Computador(ComputadorEnum.MEMORIA_2,
                ProcessadorEnum.INTEL_17, 453,
                "Windows 10");
        System.out.println(cp);
        Computador comp = new Computador(ComputadorEnum.MEMORIA_3,
                ProcessadorEnum.INTEL_19, 453,
                "Windows 10");
        System.out.println(comp);
    }
    
    
}