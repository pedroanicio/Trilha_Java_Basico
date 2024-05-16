
package POO.Enum;


public class Enum {

    // Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
    public enum EstadoBrasileiro {
        SAO_PAULO ("SP","São Paulo"),
        RIO_JANEIRO ("RJ", "Rio de Janeiro"),
        PIAUI ("PI", "Piauí"),
        MARANHAO ("MA","Maranhão") ;

        private String nome;
        private String sigla;

        private EstadoBrasileiro(String sigla, String nome) {
            this.sigla = sigla;
            this.nome = nome;
        }
        public String getSigla() {
            return sigla;
        }
        public String getNome() {
            return nome;
        }
        public String getNomeMaiusculo() {
            return nome.toUpperCase();
        }

    }

    // qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
    public class SistemaIbge {
        public static void main(String[] args) {
            //imprimindo os estados existentes no enum
            for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
                System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
            }

            //selecionando um estado a partir das opções disponíveis
            EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;

            System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
        }
    }
}
