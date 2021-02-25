package Exercicio3;
import java.util.ArrayList;
import java.util.List;

import Exercicio2.*;


public class SimulacaoCustoFrete {

	public static void main(String[] args) {


        int caminhoes = 0;
        int vagoes = 0;
        double custo = 0;

        // Lista pesos
        List<Double> pesos = new ArrayList<>();
        pesos.add(18550.00);
        pesos.add(8100.00);
        pesos.add(25700.00);;
        pesos.add(9541.00);
        pesos.add(25740.00);
        pesos.add(5000.00);
        pesos.add(8900.00);

        // Lista valores
        List<Double> valores = new ArrayList<>();
        valores.add(27500.00);
        valores.add(35410.00);
        valores.add(3650.00);
        valores.add(5799.00);
        valores.add(5799.00);
        valores.add(45000.00);
        valores.add(90570.00);
        valores.add(41000.00);
        

        for (int i = 0; i < pesos.size(); i++) {
            Vagao vagao = new Vagao(valores.get(i), pesos.get(i));
            Caminhao caminhao = new Caminhao(valores.get(i), pesos.get(i));

            if (vagao.calculaFrete() < caminhao.calculaFrete()) {
                vagoes += 1;
                custo += vagao.calculaFrete();
            }
            else {
                caminhoes += 1;
                custo += caminhao.calculaFrete();
            }
        }

        if (vagoes == caminhoes || vagoes == 0) {
            System.out.println("Serao necessarios " + caminhoes + " caminhoes!");
            System.out.printf("O custo total é de $%.2f", custo);
        }
        else {
            System.out.println("Serao necessarios " + vagoes + " vagoes e " + caminhoes + " caminhoes");
            System.out.printf("Custo total é de $%.2f", custo);
        }
    }
}