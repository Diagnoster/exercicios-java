package exercicios;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero");
		int num = entrada.nextInt();

		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) { // se o resto da divisão por 2 do num for igual a 0 = então ele mostra q é par
				System.out.println("par");
			} else {  // se não for mostra impar
				System.out.println("impar");
			} 
			
		} else { // else no primeiro if, se não for entre 0 e 10 ele mostra essa msg \/
			{
				System.out.println("numero não está entra 0 e 10");
			}
		}
		entrada.close();
	}
}
