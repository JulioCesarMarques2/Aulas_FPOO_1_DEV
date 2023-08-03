package Atividade01;

public class kMpessoa {

    public static void main(String[] args) {
        int kMpessoa = 350;
        if (kMpessoa > 200) {
            double valor = 0.45 * (kMpessoa - 200);
            System.out.println("Valor acima de 200 = " + valor);

        }

        int kMpessoa2 = 150;
        if (kMpessoa2 < 200) {
            double valor2 = 0.50 * (kMpessoa2 - 200);
            System.out.println("Valor abaixo de 200 = " + valor2);
        }
    }
}
