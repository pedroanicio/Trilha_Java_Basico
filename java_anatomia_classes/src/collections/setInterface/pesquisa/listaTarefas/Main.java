package collections.setInterface.pesquisa.listaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Estudar programação.");

        listaTarefa.removerTarefa("Estudar programação.");
        listaTarefa.removerTarefa("Estudar java.");

        listaTarefa.adicionarTarefa("Estudar programação.");
        listaTarefa.adicionarTarefa("Estudar Redes.");
        listaTarefa.adicionarTarefa("Estudar AEDS.");
        listaTarefa.adicionarTarefa("Estudar Cálculo.");

        System.out.println(listaTarefa.exibirTarefas());

        System.out.println(listaTarefa.contarTarefas());

        System.out.println(listaTarefa.obterTarefaConcluida());
        System.out.println(listaTarefa.obterTarefaPendente());

        listaTarefa.marcarTarefaConcluida("Estudar Redes.");
        System.out.println(listaTarefa.obterTarefaConcluida());

        listaTarefa.marcarTarefaPendente("Estudar Redes.");
        System.out.println(listaTarefa.obterTarefaConcluida());

        listaTarefa.limparLista();
        System.out.println(listaTarefa.exibirTarefas());


    }
}
