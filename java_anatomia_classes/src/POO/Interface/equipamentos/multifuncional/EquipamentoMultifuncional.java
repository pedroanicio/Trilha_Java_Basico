package POO.Interface.equipamentos.multifuncional;

import POO.Interface.equipamentos.copiadora.Copiadora;
import POO.Interface.equipamentos.digitalizadora.Digitalizadora;
import POO.Interface.equipamentos.impressora.Impressora;

//precisa ter todas as funcoes, imprimir, digitalziar e copiar
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar(){
        System.out.println("copiando via equipamento multifuncional");
    }
    public void digitalizar(){
        System.out.println("digitalizando via equipamento multifuncional");
    }
    public void imprimir(){
        System.out.println("imprimindo via equipamento multifuncional");
    }
}
