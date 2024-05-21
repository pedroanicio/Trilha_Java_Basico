package collections.listInterface.operacoesBasicas.carrinhoDeCompras;

public class Item {

    private String nome;
    private int qtde;
    private double valor;

    public Item(String nome, int qtde, double valor) {
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "Item{" +
                "nome='" + nome + '\'' +
                ", qtde=" + qtde +
                ", valor=" + valor +
                '}' + "\n";
    }
}
