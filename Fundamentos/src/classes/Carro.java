/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String marca;
    private String cor;
    private int qtdeRoda;
    private int ano;
    private String modelo;
    private String situacao;
    private int velocidade;

    public Carro(String marca, String cor, int qtdeRoda, int ano, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.qtdeRoda = qtdeRoda;
        this.ano = ano;
        this.modelo = modelo;
        this.situacao = "Parado";
        this.velocidade = 0;
    }
    public void andar(int velocidade) {
        System.out.println("Carro andando");
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
     public void freiar() {
        this.situacao = "Freiando";
        this.velocidade = 1;
    }

    @Override
    public String toString() {
        return "Carro " + "marca = " + marca + ", cor = " + cor + ", qtdeRoda = " + qtdeRoda + ", ano = "
                + ano + ", model o= " + modelo + ", situacao = " + situacao + ", velocidade = " + velocidade;
    }

    
    
    
    
}
