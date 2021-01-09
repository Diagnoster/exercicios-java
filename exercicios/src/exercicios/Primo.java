package exercicios;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se � primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) { // i vai ser sempre um n�mero menor que a variavel n�mero digitada!
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " � primo.");
		} else {
			System.out.println("\nO numero " + numero + " n�o � primo.");
		}

		scanner.close();

	}

}