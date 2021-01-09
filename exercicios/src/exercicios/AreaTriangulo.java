package exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a base do triangulo: ");
		int base = entrada.nextInt();
		
		System.out.println("Informe a altura do triangulo: ");
		int altura = entrada.nextInt();
		
		int area = (base * altura ) / 2;
		
		System.out.printf("A área do triangulo é: %d ", area);
		
		entrada.close();
		
	}
}
