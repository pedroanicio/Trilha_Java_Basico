package collections.listInterface.pesquisa.somaDeNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros lista = new SomaNumeros();
        Numero n1 = new Numero(5);
        Numero n2 = new Numero(10);

        lista.adicionarNumero(n1);
        lista.adicionarNumero(n2);

        System.out.println(lista.somar());

        System.out.println(lista.maiorNumero());
        System.out.println(lista.menorNumero());

        System.out.println(lista.exibirNumeros());
    }
}
