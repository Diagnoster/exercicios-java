package exercicios;

import java.util.Scanner;

public class Treino {

	// james , professor n�o tinha explicado fun��o de gerar numeros aleat�rios "random", por isso fiz sem
	public static void main(String[] args) {
	
		int numero = 50;
		int qtTentativas = 0;
		int numeroDigitado= 0;
	
		Scanner entrada = new Scanner (System.in);

	
		do  {
			System.out.println("tentativas " + qtTentativas);
			System.out.println("numero?");
			numeroDigitado = entrada.nextInt();
			if (numeroDigitado > 50) {
				System.out.println("MENOR QUE " + numeroDigitado);	
				} else if (numeroDigitado < 50) {
					System.out.println("MAIOR QUE " + numeroDigitado);
				} else {
					System.out.println("Acertou!!!! o numero certo � " + numero);
				}
		} while (numeroDigitado != 50 || qtTentativas == 10);
		
		
		entrada.close();
		}
		
	}
	