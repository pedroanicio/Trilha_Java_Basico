import org.example.ApiDosCorreios;
import org.example.CadastrarPessoa;
import org.example.DadosLocalizacao;
import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    @Mock
    private ApiDosCorreios apiDosCorreios;


    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Ouro Branco", "Rua 1", "Casa", "Bairro 1 ");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("12345")).thenReturn(dadosLocalizacao);
        Pessoa pedro = cadastrarPessoa.cadastrarPessoa("Pedro", "1234", LocalDate.now(), "12345");

        Assertions.assertEquals("Pedro", pedro.getNome());
        Assertions.assertEquals("1234", pedro.getDocumento());
        Assertions.assertEquals("MG", pedro.getEndereco().getUf());


    }
    @Test
    void lancarExceptionQuandoChamarAPIdosCorreios(){
       Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("12345")).thenThrow(IllegalArgumentException.class);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                cadastrarPessoa.cadastrarPessoa("Pedro", "1234", LocalDate.now(), "12345"));
    }
}
