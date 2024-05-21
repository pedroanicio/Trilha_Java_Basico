package desafios;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroConta;
        String agencia, nomeCLiente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = s.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = s.nextInt();
        s.nextLine();
        System.out.println("Por favor, digite seu nome!");
        nomeCLiente = s.nextLine();
        System.out.println("Por favor, digite seu saldo!");
        saldo = s.nextDouble();

        System.out.print("Olá "+nomeCLiente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ ", conta "+numeroConta+
        " e seu saldo " +saldo+" já está disponível para saque");
    }
}