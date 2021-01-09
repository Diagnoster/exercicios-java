package exercicios;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0; // vai armazenar o maiorValor digitado
		int contador = 0; // vai contar dez numeros para serem digitados

		do {
			System.out.println("\nDigite um numero: "); 
			int valor = scanner.nextInt(); // armazena o número digitado 

			if (valor > maiorValor) { // se o numero digitado foi maior que o maiorValor , ele passa a ser o maior valor
				maiorValor = valor;
			}

			contador++; // adiciona um ao contador
		} while (contador != 10); // se for diferente de 10, termina

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();
	}

}
