package POO.Interface.equipamentos.estabelecimento;

import POO.Interface.equipamentos.impressora.DeskJet;
import POO.Interface.equipamentos.impressora.Impressora;
import POO.Interface.equipamentos.impressora.LaserJet;
import POO.Interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora1 = new DeskJet();

        impressora1.imprimir();
        //polimorfismo
        Impressora impressora2 = new LaserJet();

        EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();

        equipamentoMultifuncional.copiar();


    }
}
