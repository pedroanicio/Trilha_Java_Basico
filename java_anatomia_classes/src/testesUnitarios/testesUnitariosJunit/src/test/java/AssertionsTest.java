import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {1,2,3,4,5};
        int[] segundoLancamento = {1,2,3,4,5};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
    }
}
