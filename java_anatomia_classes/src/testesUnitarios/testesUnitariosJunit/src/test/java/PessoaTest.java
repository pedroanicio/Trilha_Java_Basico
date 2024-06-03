
import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void verificarIdadeCorretamente(){
        Pessoa pedro = new Pessoa("Pedro", LocalDateTime.of(2003, 7, 17, 05, 0, 0));
        Assertions.assertEquals(20, pedro.getIdade());
    }

    @Test
    void TestarMaioridade(){
        Pessoa pessoa = new Pessoa("Lucas", LocalDateTime.of(2018, 01, 23, 05, 0,0));
        Assertions.assertFalse(pessoa.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Pedro", LocalDateTime.of(2003, 7, 17, 05, 0, 0));
        Assertions.assertTrue(pessoa2.ehMaiorDeIdade());
    }
}