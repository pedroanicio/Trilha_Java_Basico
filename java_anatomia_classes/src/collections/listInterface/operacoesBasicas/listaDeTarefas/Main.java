package collections.listInterface.operacoesBasicas.listaDeTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefa t = new ListaTarefa();

        t.adicionarTarefa("descricao");

        t.adicionarTarefa("descricao2");

        System.out.println(t.obterNumeroDeTarefas());

        t.removerTarefa("descricao2");

        System.out.println(t.obterNumeroDeTarefas());

        t.adicionarTarefa("descricao3");

        t.obterDescricoeTrefa();


    }
}
