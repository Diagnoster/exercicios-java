package exercicios;

import java.util.Scanner;

public class ValorAoQuadraCubo {

	public static void main(String[] args) {
		
		// ENTRADA DE UM NUMERO E MOSTRAR VALOR AO QUADRADO E AO CUBO
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um n�mero: ");
		double valor1 = entrada.nextDouble();
		double quadrado = Math.pow(valor1, 2);
		double cubo = Math.pow(valor1, 3);
		
		System.out.printf("O valor ao quadrado do n�mero �: " + quadrado + " " + "e o valor ao cubo �: " + cubo);
		
		
		entrada.close();
	}
}
