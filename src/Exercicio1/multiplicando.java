package Exercicio1;

import java.util.Scanner;

public class multiplicando {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Multiplicando: ");
		int multiplicando = input.nextInt();

		System.out.print("Início do intervalo: ");
		int inicioIntervalo = input.nextInt();

		System.out.print("Fim do intervalo: ");
		int fimIntervalo = input.nextInt();

		if (multiplicando <= 0 || multiplicando >= 3000) {
			System.out.println("Multiplicando deve ser um valor maior que 0 e menor que 3000");
		} else if ((inicioIntervalo < 0 || inicioIntervalo > 3000) && (fimIntervalo < 0 || fimIntervalo > 3000)) {
			System.out.println("Inicio e fim do intervalo não podem ser menores que zero ou maiores que 3000");
		} else if (inicioIntervalo > fimIntervalo) {
			System.out.println("O Inicio do intervalo deva ser menor que o término do intervalo");
		} else if ((fimIntervalo - inicioIntervalo) > 10) {
			System.out.println("Intervalo entre " + inicioIntervalo + " e " + fimIntervalo + ": inváido.");
		} else {
			for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
				System.out.println(multiplicando + " x " + i + " = " + multiplicando * i);
			}
		}
		input.close();
	}
}