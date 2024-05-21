package desafios.desafioDeCodigo;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        int valortotal = 0;

        for(int i = 0; i <= limiteDiario; i = i+valortotal){
            int valorSaque = scanner.nextInt();
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                System.exit(0);
            }else{
                if (valorSaque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    System.exit(0);
                }else{
                    limiteDiario = limiteDiario - valorSaque;
                    valortotal = valortotal + valorSaque;
                    System.out.println("Saque realizado. Limite restante: "+limiteDiario);
                }
            }
        }

// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}