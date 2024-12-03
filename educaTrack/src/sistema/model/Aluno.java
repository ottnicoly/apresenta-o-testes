package sistema.model;

import java.util.List;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private double media;
    private double nota;
    private List<Nota> notas;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, double nota ) {
        this.nome = nome;
        this.nota = nota;
    }

    public Aluno(String nome, String matricula, String curso, List<Nota> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }

    public String calcularSituacao() {
        return media >= 6.0 ? "Aprovado" : "Reprovado";
    }

    public void alterarNota(String tipo, double novaNota) {
        for (Nota nota : notas) {
            if (nota.getTipo().equals(tipo)) {
                nota.setValor(novaNota);
            }
        }
    }

    public double calcularMedia() {
        return notas.stream().mapToDouble(Nota::getValor).average().orElse(0.0);
    }


    public String consultarHistorico() {
        StringBuilder historico = new StringBuilder();
        historico.append("Nome: ").append(this.nome).append("\n");
        for (int i = 0; i < notas.size(); i++) {
            historico.append("Nota ").append(i + 1).append(": ").append(notas.get(i)).append("\n");
        }
        historico.append("Média: ").append(String.format("%.2f", calcularMedia())).append("\n");
        System.out.println(historico);
        return historico.toString();
    }

    public void adicionarNota(Nota nota) {
        this.notas.add(nota);
    }

    public double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }



}
