package sistema.service;

import sistema.model.Nota;

import java.util.List;

public class CalculoMedia {

    public double calcularMedia(List<Nota> notas) {
        double soma = 0;
        double pesoProva = 0.7;
        double pesoTrabalho = 0.3;

        for (Nota nota : notas) {
            if (nota.getTipo().equals("Prova")) {
                soma += nota.getValor() * pesoProva;
            } else if (nota.getTipo().equals("Trabalho")) {
                soma += nota.getValor() * pesoTrabalho;
            }
        }
        return soma;
    }

}
