package collections.setInterface.pesquisa.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> lista;

    public ListaTarefa() { this.lista = new HashSet<>(); }

    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao, false));
    }
    public void removerTarefa(String descricao){
        if (!lista.isEmpty()){
            for (Tarefa t : lista){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    lista.remove(t);
                    System.out.println("Tarefa: `"+descricao+"` apagada.");
                }
            }
        }else{
            System.out.println("Tarefa inexistente.");
        }
    }
    public Set<Tarefa> exibirTarefas(){
        System.out.println("Tarefas: ");
        return lista;
    }
    public int contarTarefas(){
        int qtde;
        qtde = lista.size();
        System.out.print("Quantidade de tarefas: ");
        return qtde;
    }
    public Set<Tarefa> obterTarefaConcluida(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!lista.isEmpty()){
            for (Tarefa t: lista){
                if (t.isConclusao()){
                    tarefasConcluidas.add(t);
                }
            }
        }else{
            System.out.println("Lista vazia.");
        }
        System.out.println("Tarefas concluidas: ");
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefaPendente(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!lista.isEmpty()){
            for (Tarefa t: lista){
                if (!t.isConclusao()){
                    tarefasPendentes.add(t);
                }
            }
        }else{
            System.out.println("Lista vazia.");
        }
        System.out.println("Tarefas pendentes: ");
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!lista.isEmpty()){
            for (Tarefa t: lista){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConclusao(true);
                    System.out.println("Tarefa concluida");
                    break;
                }
            }
        }else {
            System.out.println("Lista vazia.");
        }
    }
    public void marcarTarefaPendente(String descricao){
        if (!lista.isEmpty()){
            for (Tarefa t: lista){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConclusao(false);
                    System.out.println("Tarefa pendente");
                    break;
                }
            }
        }else {
            System.out.println("Lista vazia.");
        }
    }

    public void limparLista(){
        lista.clear();
    }
}
