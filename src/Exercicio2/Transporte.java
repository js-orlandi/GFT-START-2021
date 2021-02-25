package Exercicio2;

public abstract class Transporte extends Carga{
    public Transporte(double valor, double peso) {
        super(valor, peso);
    }

    public double calculaFrete() {
        return 0;
    }

}
