package collections.setInterface.operacoesBasicas.conjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Pedro", 12345);
        conjuntoConvidados.adicionarConvidado("Pedro", 123345);

        conjuntoConvidados.removerConvidadoPorCodigo(12345);

        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibir();
    }
}
