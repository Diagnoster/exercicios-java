package exercicios;

import java.util.Scanner;

public class PrimoComSwitch {

	public static void main(String[] args) {
		/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) { // 

		case 0: // enquanto esse valor corresponder o que esta na variavel contadorDeDivisores, vai executar esta parte
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default: // caso não seja zero, vai vir para esta parte
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		scanner.close();

	}
}