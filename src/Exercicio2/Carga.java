package Exercicio2;

public class Carga {
    public double valor;
    public double peso;

    public Carga(double valor, double peso) {
        setValor(valor);
        setPeso(peso);
    }

    // Getters
    public double getValor() {
        return valor;
    }

    public double getPeso() {
        return peso;
    }
    

    // Setters
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
