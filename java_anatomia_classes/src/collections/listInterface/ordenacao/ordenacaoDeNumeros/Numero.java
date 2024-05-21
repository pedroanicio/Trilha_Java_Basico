package collections.listInterface.ordenacao.ordenacaoDeNumeros;

public class Numero implements Comparable<Numero>{
    private int n;

    public Numero(int n) {
        this.n = n;
    }

    @Override
    public int compareTo(Numero n) {
        return 0;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "valor=" + n +
                '}';
    }
}
