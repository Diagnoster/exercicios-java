package exercicios;

import java.util.Scanner;

public class Bissexto {
	
	public static void main(String[] args) {

		// SE FOR DIVISIVEL POR 4, VERIFICAR SE � POR 100, SE NAO FOR, � BISSEXTO;
		// SE NAO FOR DIVISIVEL POR 4, VERIFICAR SE ELE � DIVISIVEL POR 400, SE N�O FOR, N�O � BISSEXTO. SE FOR � BISSEXTO.
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um ano: ");
		int ano = entrada.nextInt();
		int bissexto = ano % 4;
		
		if (bissexto == 0) {
			System.out.println(ano + " � um ano bissexto");
			
		} else {
			System.out.println(ano + " n�o � um ano bissexto");
		}
	
		
		
		entrada.close();
	}

}
