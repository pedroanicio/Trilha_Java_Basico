package collections.setInterface.ordenacao.cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> cadastro;

    public CadastroProduto() {
        this.cadastro = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, int qtde, double valor){
        cadastro.add(new Produto(nome, codigo, qtde, valor));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(cadastro);// treeset pois hashset nao permite deixar ordenado
        if (!cadastro.isEmpty()){
            return produtosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!cadastro.isEmpty()) {
            produtosPorPreco.addAll(cadastro);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
}