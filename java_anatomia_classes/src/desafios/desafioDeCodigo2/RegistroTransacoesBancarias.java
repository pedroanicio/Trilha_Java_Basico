package desafios.desafioDeCodigo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        //System.out.println("Digite a quantidade de transações: ");
        int quantidadeTransacoes = scanner.nextInt();
        scanner.nextLine();

        List<String> lista = new ArrayList<String>();

        for(int x = 0; x < quantidadeTransacoes; x++){
            String tipo;
            double valor;
            //System.out.println("digite o tipo: (D ou S)");
            tipo = scanner.nextLine().toUpperCase();
            if (tipo.equals("D")){
                //System.out.println("digite o valor: ");
                valor = scanner.nextDouble();
                saldo = saldo + valor;
                lista.add(x+1 + ". Deposito de " + valor);
            }else {
                //System.out.println("digite o valor: ");
                valor = scanner.nextDouble();
                saldo = saldo - valor;
                 lista.add(x+1 + ". Saque de " + valor);
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Saldo: " + saldo);

        // Imprimir transações
        System.out.println("Transacoes:");
        for (String transacao : lista) {
            System.out.println(transacao);
        }

    }
}

