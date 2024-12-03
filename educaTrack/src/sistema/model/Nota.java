package sistema.model;

public class Nota {

    private String tipo;
    private double valor;

    public Nota(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.valueOf(this.valor);
    }
}
