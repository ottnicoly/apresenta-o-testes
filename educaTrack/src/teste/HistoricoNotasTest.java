package teste;

import org.junit.Test;
import sistema.model.Aluno;
import sistema.model.Nota;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class HistoricoNotasTest {

    @Test
    public void testConsultaHistoricoNotas() {
        List<Nota> notas = new ArrayList<>();

        Nota notaProva1 = new Nota("Prova", 8.0);
        Nota notaProva2 = new Nota("Prova", 7.5);
        Nota notaTrabalho = new Nota("Trabalho", 9.0);

        notas.add(notaProva1);
        notas.add(notaProva2);
        notas.add(notaTrabalho);

        Aluno aluno = new Aluno("João Silva", "12345", "Engenharia", notas);
        String historico = aluno.consultarHistorico();

        assertTrue(historico.contains("João Silva"));
        assertTrue(historico.contains("Nota 1: 8.0"));
        assertTrue(historico.contains("Nota 2: 7.5"));
        assertTrue(historico.contains("Média: 8.17"));

    }

}
