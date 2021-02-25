package Exercicio2;

public class Vagao extends Transporte {

	public Vagao(double valor, double peso) {
		super(valor, peso);
	}

	@Override
	public double calculaFrete() {
		if (getPeso() < 15000) {
			return 5000 + (getPeso() * 0.2) + (getValor() * 0.1);
		} else {
			return (getPeso() * 0.2) + (getValor() * 0.1);
		}
	}
}
