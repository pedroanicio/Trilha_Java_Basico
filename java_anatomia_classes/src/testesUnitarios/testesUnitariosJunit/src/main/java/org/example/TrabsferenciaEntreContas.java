package org.example;

public class TrabsferenciaEntreContas {
    public void transfere(Conta contaOrigem, Conta contaDestino, int valor){
        if (valor <= 0){
            throw  new IllegalArgumentException("Valor deve ser maior que zero.");
        }
    }
}
