import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.awt.*;

@ExtendWith(MockitoExtension.class)
public class ListaTest {

    @Mock
    private List letras;

    @Test
    void adicionarItem(){
        Mockito.when(letras.getItem(0)).thenReturn("B");

        Assertions.assertEquals("B", letras.getItem(0));
    }
}
