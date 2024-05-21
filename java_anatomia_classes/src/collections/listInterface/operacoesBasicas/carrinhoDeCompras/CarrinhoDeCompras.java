package collections.listInterface.operacoesBasicas.carrinhoDeCompras;

import collections.listInterface.operacoesBasicas.listaDeTarefas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double valor, int qtde){
        carrinho.add(new Item(nome, qtde, valor));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item i : carrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        carrinho.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double soma = 0;
        for (Item i : carrinho){
            soma = soma + i.getValor();
        }
        return soma;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }
}
