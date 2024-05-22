package collections.setInterface.pesquisa.agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() { this.agenda = new HashSet<>(); }

    public void adicinarContato(String nome, int telefone){
        agenda.add(new Contato(nome, telefone));
    }
    public void exibirContatos(){
        System.out.println(agenda);
    }
    public void pesquisarPorNome(String palavra){
        Set<Contato> agendaEspecifica = new HashSet<>();
        if (!agenda.isEmpty()){
            for (Contato c : agenda){
                if (c.getNome().startsWith(palavra)){
                    agendaEspecifica.add(c);
                }
            }
            System.out.println(agendaEspecifica);
        }else{
            System.out.println("Agenda Vazia.");
        }
    }
    public void atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : agenda){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        System.out.println(contatoAtualizado);
    }
}
