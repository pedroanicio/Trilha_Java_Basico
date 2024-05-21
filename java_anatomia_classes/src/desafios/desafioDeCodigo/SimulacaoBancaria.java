package desafios.desafioDeCodigo;

import java.util.Scanner;

public class SimulacaoBancaria {

    static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 

            //System.out.println("1. Depositar");
            //System.out.println("2. Sacar");
            //System.out.println("3. Consultar Saldo");
            //System.out.println("4. Encerrar");

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 1:
                    saldo = Depositar(saldo);
                    ConsultarSaldo(saldo);
                    break;
                case 2:
                    try {
                        saldo = Sacar(saldo);
                        ConsultarSaldo(saldo);
                    } catch (ValorInvalido e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    ConsultarSaldo(saldo);
                    break;
                case 4:
                    Encerrar();
                    break;
                default:
                    System.out.println("Programa encerrado."); 
                    Encerrar();
                    
            }
        }
    }

    public static double Depositar(double saldo){
        double valor;
        //System.out.println("Qual o valor será depositado? ");
        valor = scanner.nextDouble();

        return saldo + valor;
    }
    public static double Sacar(double saldo) throws ValorInvalido{
        double valor;
        //System.out.println("Qual o valor será sacado? ");
        valor = scanner.nextDouble();

        if(valor >= saldo){
            throw new ValorInvalido("Saldo insuficiente.");
        }else{
            return saldo - valor;
        }
    }
    public static void ConsultarSaldo(double saldo){
        System.out.println("Saldo atual: "+saldo);
    }
    public static void Encerrar(){
        System.exit(0);
    }

    public static class ValorInvalido extends Exception {
        public ValorInvalido(String mensagem) {
            // Chama o construtor da classe base (Exception) com a mensagem fornecida
            super(mensagem);
        }
    }
}