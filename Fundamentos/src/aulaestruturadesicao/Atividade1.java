package aulaestruturadesicao;

public class Atividade1 {

public static void main(String[] args) {
    int gerente = 1;
    double salario = 5590.00;
    double convenio = 289.00;
    int INSS = 8;
    if (gerente == 1) {
        double desconto = salario * (INSS / 100) + convenio;
        double total = salario - desconto;
        System.out.println("O valor total do gerente e " + total);
    }
    int supervisor = 1;
    double salario2 = 4128.00;
    double convenio2 = 239.00;
    int INSS2 = 7;
    if (supervisor == 1) {
        double desconto2 = salario2 * (INSS2 / 100) + convenio2;
        double total = salario2 - desconto2;
        System.out.println("O valor total do supervisor e " + total);

    }
    int tecnico = 1;
    double salario1 = 3789.00;
    double convenio1 = 189.00;
    int INSS1 = 4;
    if (tecnico == 1) {
        double desconto1 = salario1 * (INSS1 / 100) + convenio1;
        double total = salario1 - desconto1;
        System.out.println("O valor total do tecnico e " + total);
    }
    int auxiliar = 1;
    double salario4 = 2345.00;
    double convenio4 = 156.00;
    int INSS4 = 2;
    if (auxiliar == 1) {
        double desconto4 = salario4 * (INSS4 / 100) + convenio4;
        double total = salario4 - desconto4;
        System.out.println("O valor total do auxiliar e " + total);

    }
}
}
