package exercicios;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero");
		int num = entrada.nextInt();

		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) { // se o resto da divis�o por 2 do num for igual a 0 = ent�o ele mostra q � par
				System.out.println("par");
			} else {  // se n�o for mostra impar
				System.out.println("impar");
			} 
			
		} else { // else no primeiro if, se n�o for entre 0 e 10 ele mostra essa msg \/
			{
				System.out.println("numero n�o est� entra 0 e 10");
			}
		}
		entrada.close();
	}
}
