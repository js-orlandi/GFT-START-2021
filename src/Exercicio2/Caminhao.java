package Exercicio2;

public class Caminhao extends Transporte {
    public Caminhao(double valor, double peso) {
        super(valor, peso);
    }

    @Override
    public double calculaFrete() {
        if (getValor() > 40000) {
            return 0.75 * (getPeso() * 0.12) + (getValor() * 0.30);
        }
        else {
            return (getPeso() * 0.12) + (getValor() * 0.30);
        }
    }
}