package exercicios;

import java.util.Scanner;

public class Bissexto {
	
	public static void main(String[] args) {

		// SE FOR DIVISIVEL POR 4, VERIFICAR SE É POR 100, SE NAO FOR, É BISSEXTO;
		// SE NAO FOR DIVISIVEL POR 4, VERIFICAR SE ELE É DIVISIVEL POR 400, SE NÃO FOR, NÃO É BISSEXTO. SE FOR É BISSEXTO.
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um ano: ");
		int ano = entrada.nextInt();
		int bissexto = ano % 4;
		
		if (bissexto == 0) {
			System.out.println(ano + " é um ano bissexto");
			
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
	
		
		
		entrada.close();
	}

}
