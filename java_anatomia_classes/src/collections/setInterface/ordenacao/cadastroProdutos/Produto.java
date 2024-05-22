package collections.setInterface.ordenacao.cadastroProdutos;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private int codigo, qtde;
    private double valor;

    public Produto(String nome, int codigo, int qtde, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtde = qtde;
        this.valor = valor;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", qtde=" + qtde +
                ", valor=" + valor +
                '}';
    }
}
class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getValor(), p2.getValor());
    }
}