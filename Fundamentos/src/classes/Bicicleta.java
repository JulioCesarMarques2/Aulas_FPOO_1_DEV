/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {

    //Attributes are the characteristics, in this case, the characteristics of the bicycle
    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdeMarchs;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;

    //constructor
    public Bicicleta() {
    }

    //constructor with arguments
    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdeMarchs, String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdeMarchs = qtdeMarchs;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    //Action of bicycle

    public void andar(int velocidade) {
        System.out.println("Bicliceta andando");
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade = 1;
    }

    public boolean verificarFreio() {
        return this.temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta " + "qtdeRodas = " + qtdeRodas + ", temMarchas = " + temMarchas + ", qtdeMarchs = "
                + qtdeMarchs + ", modelo = " + modelo + ", temFreio = " + temFreio + ", cor = " + cor +
                ", situacao = " + situacao + ", velocidade = " + velocidade;
    }

    
    
    
}
