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
    private CorEnum cor;
    private int qtdeRoda;
    private int ano;
    private String modelo;
    private String situacao;
    private int velocidade;
    private boolean estaEmRe;
    private int marcha;

    public Carro(String marca, CorEnum cor, int qtdeRoda, int ano, String modelo, boolean estaEmRe, int marcha) {
        this.marca = marca;
        this.cor = cor;
        this.qtdeRoda = qtdeRoda;
        this.ano = ano;
        this.modelo = modelo;
        this.situacao = "Parado";
        this.velocidade = 0;
        this.estaEmRe = estaEmRe;
        this.marcha = marcha;

    }

    public void trocarMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
        } else {
            System.out.println("Voce nao pode pular a marcha");
        }

    }

    public void engatarRe(boolean re) {
        this.estaEmRe = re;
    }

    @Override
    public String toString() {
        return "Carro " + " marca = " + marca + ", cor = " + cor + ", qtdeRoda = " + qtdeRoda + ", ano = "
                + ano + ", modelo = " + modelo + ", situacao = " + situacao + ", velocidade = " 
                + velocidade + ", estaEmRe = " + estaEmRe + ", marcha = " + marcha;
    }

}
