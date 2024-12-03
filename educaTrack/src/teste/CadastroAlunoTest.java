package teste;

import org.junit.Test;
import sistema.model.Aluno;
import sistema.service.CadastroAlunos;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CadastroAlunoTest {

    @Test
    public void testCadastrarAlunoComDadosValidos() {
        CadastroAlunos cadastro = new CadastroAlunos();

        Aluno aluno1 = new Aluno("João Silva", "12345", "Engenharia");
        Aluno aluno2 = new Aluno("Maria Souza", "12346", "Medicina");

        assertTrue(cadastro.cadastrarAluno(aluno1));
        assertTrue(cadastro.cadastrarAluno(aluno2));
    }

    @Test
    public void testCadastrarAlunoComMatriculaDuplicada() {
        CadastroAlunos cadastro = new CadastroAlunos();

        Aluno aluno1 = new Aluno("João Silva", "12345", "Engenharia");
        Aluno aluno2 = new Aluno("Carlos Pereira", "12345", "Arquitetura");

        cadastro.cadastrarAluno(aluno1);
        assertFalse(cadastro.cadastrarAluno(aluno2));
    }

}
