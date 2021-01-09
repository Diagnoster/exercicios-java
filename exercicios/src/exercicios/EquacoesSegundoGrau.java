package exercicios;

import java.util.Scanner;

public class EquacoesSegundoGrau {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o valor de A: ");
		double a = entrada.nextInt();
		
		System.out.println("Informe o valor de B: ");
		double b = entrada.nextInt();
		
		System.out.println("Informe o valor de C: ");
		double c = entrada.nextInt();
		
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		
		System.out.printf("O valor de delta é: %.2f\n", delta);
		
		double deltaRaiz = Math.sqrt(delta);
		double bhaskara1 = (-b + deltaRaiz) / (2 * a);
		
		double bhaskara2 = (-b - deltaRaiz) / (2 * a);
		
		System.out.printf("O valor de x1 é: %.2f\n", bhaskara1);
		System.out.printf("O valor de x2 é: %.2f", bhaskara2);
		
		
		entrada.close();
	}

	
}
