package sistema.service;

import sistema.model.Aluno;
import java.util.HashSet;
import java.util.Set;

public class CadastroAlunos {

    private Set<Aluno> alunosCadastrados = new HashSet<>();

    public boolean cadastrarAluno(Aluno aluno) {
        for (Aluno a : alunosCadastrados) {
            if (a.getMatricula().equals(aluno.getMatricula())) {
                return false;
            }
        }
        alunosCadastrados.add(aluno);
        return true;
    }
}
