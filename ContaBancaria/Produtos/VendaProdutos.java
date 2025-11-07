package Produtos;

public class VendaProdutos {
    public static void main(String[] args) {
        
        Produtos produto1 = new Produtos(101, "Notebook", 150.00, 00);

    //... 
        produto1.atualizarEstoque(50);
        produto1.aplicarDesconto(20.0);
        produto1.aplicarDesconto(40.0);
        produto1.venderProduto(10);
        produto1.venderProduto(45);
        produto1.dadosProduto();
    }

}
