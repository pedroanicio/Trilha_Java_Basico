package POO.Pilares;

public class Carro extends Veiculo { //herança


    //encapsulamento
    public void ligar()  {
        confereCambio();
        confereCombustivel();
        System.out.println("carro ligado");

    }
    private void confereCombustivel(){
        System.out.println("conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("conferindo cambio");
    }
}
