package Desafios.DesafiosPOO.desafio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");
        Conta cc2 = new ContaCorrente(pedro);
        Conta poupanca2 = new ContaPoupanca(pedro);

        cc2.depositar(100);
        cc2.transferir(100, poupanca2);

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);


        banco.adicionarConta(cc2);
        banco.adicionarConta(poupanca2);

        System.out.println(banco.getContas());



    }

}
