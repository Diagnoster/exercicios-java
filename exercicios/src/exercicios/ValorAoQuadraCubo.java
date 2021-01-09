package exercicios;

import java.util.Scanner;

public class ValorAoQuadraCubo {

	public static void main(String[] args) {
		
		// ENTRADA DE UM NUMERO E MOSTRAR VALOR AO QUADRADO E AO CUBO
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		double valor1 = entrada.nextDouble();
		double quadrado = Math.pow(valor1, 2);
		double cubo = Math.pow(valor1, 3);
		
		System.out.printf("O valor ao quadrado do número é: " + quadrado + " " + "e o valor ao cubo é: " + cubo);
		
		
		entrada.close();
	}
}
