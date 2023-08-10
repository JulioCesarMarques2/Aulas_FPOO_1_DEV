package aulaestruturadesicao;

public class ifelse2 {

    public static void main(String[] args) {
        int temperatura = 15;
        if (temperatura == 15) {
            System.out.println("esta frio");

        } else if (temperatura == 20) {
            System.out.println("esta agradavel");

        } else if (temperatura == 25) {
            System.out.println("esta quente");
        }
        switch (temperatura) {
            case 15:
                System.out.println("esta frio");
                break;
            case 20:
                System.out.println("esta agradavel");
                break;
            case 25:
                System.out.println("esta quente");
                break;
            default:
                System.out.println("nao identificado");
                break;
        }
    }
}
