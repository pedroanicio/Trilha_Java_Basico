package POO.construtor;

public class Construtor {
    public static class Pessoa {
        private String nome;
        private String cpf;
        private String endereco;

        // método construtor
        // o nome deverá ser igual ao nome da classe
        public Pessoa (String cpf, String nome) {
            this.cpf = cpf;
            this.nome = nome;
        }

        //...
        //getters
        //setters
    }
    public class SistemaCadastro {
        public static void main(String[] args) {
            //criamos uma pessoa no sistema
            Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");

            //continua ...

        }
    }

}
