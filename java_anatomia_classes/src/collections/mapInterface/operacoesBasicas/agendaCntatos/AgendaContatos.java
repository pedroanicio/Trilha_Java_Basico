package collections.mapInterface.operacoesBasicas.agendaCntatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agenda;

    public AgendaContatos() { this.agenda = new HashMap<>(); }

    public void adicionarContato(String nome, Integer telefone){
        agenda.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agenda.isEmpty()){
            agenda.remove(nome);
        } else {
            System.out.println("Lista vazia.");
        }
    }
    public void exibirContatos(){
        System.out.println(agenda);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numero = null;
        if (!agenda.isEmpty()){
           numero = agenda.get(nome);
        }

        return numero;

    }


}
