package Atividade01;

public class Calculadora {
    private double nota1;
    private double nota2;

    public Calculadora(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double dividir() {
        double resultado = this.nota1 / this.nota2;
        return resultado;
    }

    public double dividirE() throws Exception {
        double resultado = this.nota1 / this.nota2;
        return resultado;
    }

}
