package POO.getSetter;

public class getSet {

    //arquivo Aluno.java
    public static class Aluno {
        private String nome;
        private int idade;

        public String getNome() {
            return nome;
        }
        public void setNome(String newNome) {
            nome = newNome;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int newIdade) {
            this.idade = newIdade;
        }
    }
    //arquivo Escola.java
    public class Escola {
        public static void main(String[] args) {
            Aluno felipe = new Aluno();
            felipe.setNome("Felipe");
            felipe.setIdade(8);

            System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
        }
    }
}
