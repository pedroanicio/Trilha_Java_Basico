package desafios.desafioDeCodigo;

import java.util.Scanner;

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        String numeroConta;
 
// TODO: Inicialize um bloco try-catch para capturar exceções:
        try {
            numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
        
// TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
    }
    
    private static void verificarNumeroConta(String numeroConta) { 

        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }else{
            System.out.println("Numero de conta valido.");
        }
  
    }

}


