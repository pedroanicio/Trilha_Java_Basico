package ControleFLuxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceções {
    //Estruturas de exceções: try-catch-finally, throw
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        //digitar um valor diferente de int
        try{
            x = s.nextInt();
        }catch(InputMismatchException e){
            System.err.println("O campo precisa ser int");
        }
            

    }
    
}
