package exercicios;

import java.util.Scanner;

public class IndiceMassaCorporal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("informe seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("informe sua altura: ");
		double altura = entrada.nextDouble();
		double altura2 = Math.pow(altura, 2);
		
		double resultado= peso / altura2;
		
		System.out.printf("Seu IMC %.2f", resultado); // limitando o numero de casas decimais com o .2 para duas casas
		
		entrada.close();
	}

}
