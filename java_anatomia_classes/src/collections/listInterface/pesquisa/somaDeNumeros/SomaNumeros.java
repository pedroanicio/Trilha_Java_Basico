package collections.listInterface.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MIN_VALUE;

public class SomaNumeros {
    private List<Numero> lista;

    public SomaNumeros() { this.lista = new ArrayList<>(); }

    public void adicionarNumero(Numero numero){
        lista.add(numero);
    }
    public int somar(){
        int soma = 0;
        for(Numero n : lista){
            soma = soma + n.getNumero();
        }
        return soma;
    }

    public int maiorNumero(){
        int valor = Integer.MIN_VALUE;
        for(Numero n : lista){
            if (n.getNumero() >= valor) {
                valor = n.getNumero();
            }
        }
        return valor;
    }

    public int menorNumero(){
        int valor = Integer.MAX_VALUE;
        for(Numero n : lista){
            if (n.getNumero() <= valor) {
                valor = n.getNumero();
            }
        }
        return valor;
    }
    public List<Numero> exibirNumeros(){
        return lista;
    }
}
