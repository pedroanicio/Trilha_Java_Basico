package Desafios.DesafiosPOO.desafio1;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> nomes;
    private List<Conta> contas;

    public Banco() {
        nomes = new ArrayList<>();
        contas = new ArrayList<>();
    }


    public List<Cliente> getNome() {
        return nomes;
    }

    public void setNome(List<Cliente> nome) {
        this.nomes = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    public void apagarConta(Conta conta){
        contas.remove(conta);
    }
    public void adicionarNome(Cliente cliente){
        nomes.add(cliente);
    }

    public void apagarNome(Cliente cliente){
        nomes.remove(cliente);
    }
}