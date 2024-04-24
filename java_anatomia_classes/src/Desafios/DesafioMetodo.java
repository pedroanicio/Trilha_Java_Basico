package Desafios;
public class DesafioMetodo {


    public static void main(String[] args) {
        boolean ligadaDesligada = false;
        int canal = 0, volume = 10;    
        
    }

    public static boolean ligarDesligar(boolean ligadaDesligada){
        if(ligadaDesligada == false){
            return true;
        }else{
            return false;
        }
        
    }
    public static int aumentarVolume(int volume){
        if (volume<=100) {
            volume++;            
        }
        return volume;
    }

    public static int diminuirVolume(int volume){
        if (volume>=0) {
            volume--;            
        }
        return volume;
    }
    public static int trocarCanal(int canal){
        if (canal<=20) {
            canal++;            
        }else{
            canal=0;
        }
        return canal;
    }
}