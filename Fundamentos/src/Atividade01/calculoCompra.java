package Atividade01;

public class calculoCompra {

    private int numero1;
    private int numero2;
    private int numero3;

    public calculoCompra(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }
    public int multiplicar() {
        int resultado = this.numero1 % this.numero2 % this.numero3;
        return resultado;
    }
    public int multiplicarT() throws Exception {
        int resultado = this.numero1 % this.numero2 % this.numero3;
        return resultado;
    }

}
