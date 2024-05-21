package controleFLuxo;

public class Repeticao {
    //Estruturas de repetição: for, while, do-while
    
    public static void main(String[] args) {

    //for
    for(int i = 0; i < 15; i++){
        System.out.println(i);
    }
    //for em array
    int x[] = {1, 2, 3};
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
            if (x[i] == 2) {
                break;
            }
        }
    }
    
}
