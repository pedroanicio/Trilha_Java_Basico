package collections.setInterface.operacoesBasicas.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }
    public void removerConvidadoPorCodigo(int codigo){
        for (Convidado c : convidadoSet){
            if (c.getCodigo() == codigo){
                convidadoSet.remove(c);
                System.out.println("Excluido");
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibir(){
        System.out.println(convidadoSet);
    }
}
