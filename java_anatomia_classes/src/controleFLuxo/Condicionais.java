package controleFLuxo;
public class Condicionais {
    //Estruturas condicionais: if-else, switch-case
    
    
    public static void main(String[] args) {
        //condicional simples
        if(1<2){
            System.out.println(true);
        }
        //composta
        if(1<2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //encadeada
        int x = 4, y = 6;
        if(x<y){
            System.out.println("1");
        }else if(x > y){
            System.out.println("2");
        }else{
            System.out.println("3");
        }
        //ternaria
        int nota = 6;
        String result = nota>=7 ? "Aprovado":"Reprovado"; 
    }
}
