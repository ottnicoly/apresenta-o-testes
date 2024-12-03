package teste;

import org.junit.Test;
import sistema.model.Nota;
import sistema.service.CalculoMedia;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculoMediaTest {

    @Test
    public void testCalcularMedia() {
        List<Nota> notas = Arrays.asList(
                new Nota("Prova", 8.0),
                new Nota("Trabalho", 7.0)
        );

        CalculoMedia calculo = new CalculoMedia();
        double media = calculo.calcularMedia(notas);

        assertEquals(7.7, media, 0.01);
    }

}
