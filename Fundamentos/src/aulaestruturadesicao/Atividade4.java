package aulaestruturadesicao;

public class Atividade4 {
    public static void main(String[] args) {
        int Notebook = 1;
        int salario = 2000;
        int valor = 3299;
        int percentualEconomizar = 5;
        if (percentualEconomizar == 5) {
            int total = salario + valor;
            int total2 = percentualEconomizar & total;
            System.out.println("Precisara economizar por " + total2 + " meses"); 
        }
        int celular = 1;
        int valor2 = 1789;
        int salario2 = 1500;
        int percentualEconomizar2 = 10;
        if (percentualEconomizar2 == 10) {
            int total = salario2 + valor2;
            int total2 = percentualEconomizar2 & total;
            System.out.println("Precisara economizar por " + total2 + " meses"); 
        }
        int carro = 1;
        int valor3 = 68000;
        int salario3 = 2000;
        int percentualEconomizar3 = 2;
        if (percentualEconomizar3 == 2) {
            int total = salario3 + valor3;
            int total2 = percentualEconomizar3 & valor;
            System.out.println("Precisara economizar por " + total2 + " meses"); 
        }
        int apartamento = 1;
        int valor4 = 180000;
        int salario4 = 2000;
        int percentualEconomizar4 = 1;
        if (percentualEconomizar4 == 1) {
            int total = salario4 + valor4;
            int total2 = percentualEconomizar4 & valor;
            System.out.println("Precisara economizar por " + total2 + " meses"); 
        }
    }

}
