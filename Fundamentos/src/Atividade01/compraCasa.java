package Atividade01;

import java.util.Scanner;
public class compraCasa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        try {
            System.out.println("-----Calculadora de Divisao-----");
            
            System.out.println("Informe o Valor da Casa");
            int numero1 = entrada.nextInt();
            
            System.out.println("Informe o seu Salario");
            int numero2 = entrada.nextInt();
            
            System.out.println("Informe quantos anos pretende morar nessa casa");
            int numero3 = entrada.nextInt();
            
            calculoCompra calculoCompra1 = new calculoCompra(numero1, numero2, numero2);
            int resultado = calculoCompra1.multiplicar(); 
            
            System.out.println("O resultado da divisao e: " + resultado);
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao realizar a divisao");
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            entrada.close();
            System.out.println("Finalizado o Scanner");
        }
    }
    
}
 
