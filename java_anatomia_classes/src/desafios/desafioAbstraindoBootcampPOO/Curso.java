package desafios.desafioAbstraindoBootcampPOO;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return STR."Curso{titulo='\{getTitulo()}\{'\''}, descricao='\{getDescricao()}\{'\''}, cargaHoraria=\{cargaHoraria}\{'}'}";
    }
}
