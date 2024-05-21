package POO.pilares;

public class Autodromo {
    public static void main(String[] args){
        Carro Palio = new Carro();
        Palio.setChassi("354345");
        Palio.ligar();

        Moto nomemoto = new Moto();
        nomemoto.setChassi("12344");
        nomemoto.ligar();

        Veiculo coringa = Palio; //tente trocar para nomemoto

        //polimorfismo
        coringa.ligar();
    }
}
