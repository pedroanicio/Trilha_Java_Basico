package collections.setInterface.pesquisa.listaTarefas;

public class Tarefa {
    String descricao;
    boolean conclusao;

    public Tarefa(String descricao, boolean conclusao) {
        this.descricao = descricao;
        this.conclusao = conclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", conclusao=" + conclusao +
                '}';
    }
}
