package Atividade01;

public class calculaMedia {
    public static void main(String[] args) {
        try {
            Calculadora calculadora = new Calculadora(10, 8);
        double resultado = calculadora.dividir();
            System.out.println("O resultado e " + resultado);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            System.err.println("ERRO" + e.getMessage());
        }
    }

}
