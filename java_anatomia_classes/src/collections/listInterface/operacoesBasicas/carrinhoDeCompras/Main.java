package collections.listInterface.operacoesBasicas.carrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Camisa", 40.0, 2);

        carrinho.adicionarItem("Camisa", 40.0, 2);
        carrinho.adicionarItem("Calça", 30.0, 1);

        carrinho.removerItem("Camisa");
        carrinho.exibirItens();

        carrinho.adicionarItem("Camisa", 40.0, 2);
        System.out.println(carrinho.calcularValorTotal());

    }
}
