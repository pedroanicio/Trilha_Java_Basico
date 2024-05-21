package collections.listInterface.operacoesBasicas.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroDeTarefas(){
        return tarefalist.size();
    }

    public void obterDescricoeTrefa(){
        System.out.println(tarefalist);
    }

}


