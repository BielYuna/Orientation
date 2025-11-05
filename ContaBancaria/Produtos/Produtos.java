package Produtos;

import java.util.Random;

import javax.annotation.processing.Generated;

public class Produtos {

   
    private Integer codigoP;              


    private String nomeP;
    private Double precoP;
    private Integer quantidadeEstoque;

    public Produtos(Integer codigoP, String nomeP, Double precoP, Integer quantidadeEstoque) {
        this.codigoP = codigoP;
        this.nomeP = nomeP;
        this.precoP = precoP;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public void setPrecoP(Double precoP) {
        this.precoP = precoP;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNomeP() {
        return nomeP;
    }

    public Double getPrecoP() {
        return precoP;
    }

    public void aplicarDesconto(Double percentual) {
        if (percentual > 0 && percentual <= 30) {
            Double desconto = (precoP * percentual) / 100;
            precoP = precoP - desconto;
            System.out.println("Desconto aplicado! Novo preco: " + precoP);
        } else {
            System.out.println("Desconto invalido!");
        }
    }

    public Integer atualizarEstoque(int compra) {
        try {
            if (quantidadeEstoque >= compra) {
                quantidadeEstoque = quantidadeEstoque + compra;
                System.out.println("Compra realizada com sucesso! Estoque atual: ");
            } else if (quantidadeEstoque <= 10) {
                System.out.println("Estoque baixo! necessario reabastecer...");
            }
            return quantidadeEstoque;

        } catch (Exception erro) {
            System.out.println("Erro ao atualizar estoque: " + erro.getMessage());
            return quantidadeEstoque;
        }
    }
    public Integer venderProduto(int venda) {
        try {
            if (quantidadeEstoque >= venda) {
                quantidadeEstoque = quantidadeEstoque - venda;
                System.out.println("Venda realizada com sucesso! Estoque atual: " + quantidadeEstoque);
            } else {
                System.out.println("Estoque insuficiente para realizar a venda!");
            }
            return quantidadeEstoque;
        } catch (Exception erro) {
            System.out.println("Erro ao processar venda: " + erro.getMessage());
            return quantidadeEstoque;
        }
    }
    public Integer codigoP(){
        this.codigoP = this.codigoP +(int)( new Random().nextInt(100000000));
        return codigoP;
    }

    public String dadosProduto() {
        return "DADOS PRODUTO" + "\nNome: " + nomeP + "\nCodigo: " + codigoP + "\nPreco: " + precoP + "\nQuantidade em Estoque: " + quantidadeEstoque;
    }
}