/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade03;

/**
 *
 * @author Aluno
 */
public enum EnumProdutos {
    PRODUTO("banana"),
    PRODUTO1("arroz"),
    PRODUTO2("pao"),
    PRODUTO3("leite"),
    PRODUTO4("feijao"),
    PRODUTO5("maca"),
    PRODUTO6("pera"),
    PRODUTO7("vinagre");
    private String produtos;

    private EnumProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }
    
    
}
