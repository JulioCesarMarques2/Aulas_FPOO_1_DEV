/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade03;

/**
 *
 * @author Aluno
 */
public class enumeracaoProdutos {
    public static void main(String[] args) {
        Produtos produtos = new Produtos(EnumProdutos.PRODUTO.getProdutos());
        System.out.println(produtos);
        produtos.setProduto(EnumProdutos.PRODUTO1.getProdutos());
        System.out.println(produtos);
        produtos.setProduto(EnumProdutos.PRODUTO2.getProdutos());
        System.out.println(produtos);
        produtos.setProduto(EnumProdutos.PRODUTO3.getProdutos());
        System.out.println(produtos);
        produtos.setProduto(EnumProdutos.PRODUTO4.getProdutos());
        System.out.println(produtos);
        produtos.setProduto(EnumProdutos.PRODUTO5.getProdutos());
        System.out.println(produtos);
        produtos.setProduto(EnumProdutos.PRODUTO6.getProdutos());
        System.out.println(produtos);
        produtos.setProduto(EnumProdutos.PRODUTO7.getProdutos());
        System.out.println(produtos);
    }
    
}
