import org.example.GerenciadorDeConexaoComBancoDeDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
        System.out.println("Rodou");
    }

    @BeforeEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoComBancoDeDados.insereDados(
                new Pessoa("Pedro", LocalDateTime.of(2003, 7, 17, 5, 0, 0)));

    }
    @AfterEach
    void removerDadosDoTeste(){
        GerenciadorDeConexaoComBancoDeDados.removeDados(
                new Pessoa("Pedro", LocalDateTime.of(2003, 7, 17, 5, 0, 0)));
    }

    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizaConexao(){
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
        System.out.println("Finalizou");
    }
}
