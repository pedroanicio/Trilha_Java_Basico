import org.example.Conta;
import org.example.TrabsferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validaCenarioExcecaoNaTransfrencia(){

        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("654321", 100);

        TrabsferenciaEntreContas transferencia = new TrabsferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferencia.transfere(contaOrigem, contaDestino, -1));

    }
}
