package exercicios;

public class Ecommerce {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Ecommerce(int codigo, String nome, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Aplicar desconto
    public void desconto(double desconto) {
        if (desconto >= 0 && desconto <= 30) {
            preco = preco - (preco * (desconto / 100));
            System.out.println("Desconto de " + desconto + "% aplicado com sucesso!");
        } else {
            System.out.println("Erro: desconto deve ser entre 0% e 30%.");
        }
    }

    // Atualizar estoque
    public void atualizarEstoque(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            quantidadeEstoque = novaQuantidade;
            System.out.println("Estoque atualizado para: " + quantidadeEstoque);
        } else {
            System.out.println("Erro: estoque não pode ser negativo!");
        }
    }

    // Consultar informações
    public void infoProduto() {
        System.out.println("=== Informações do Produto ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }

    // Verificar disponibilidade
    public void verificarDisponibilidade() {
        if (quantidadeEstoque > 0) {
            System.out.println("Produto disponível em estoque!");
        } else {
            System.out.println("Produto fora de estoque!");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

}
