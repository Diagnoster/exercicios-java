package exercicios;

import java.util.Scanner;

public class Nota {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
				
		
		if (media >= 7 ) {
			System.out.println("M�dia " + media + " Aprovado");
		} else if(media < 7 && media >= 4) {
			System.out.println("M�dia " + media + " Recupera��o");	
		} else  {
			System.out.println("M�dia " + media + " Reprovado");
		}
		
		entrada.close();
	}

}
