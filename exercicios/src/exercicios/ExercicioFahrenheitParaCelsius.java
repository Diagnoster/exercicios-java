package exercicios;

public class ExercicioFahrenheitParaCelsius {

	public static void main(String[] args) {
		//atenc�o para a prioridade de calculo, colocar parenteses pois a divis�o tem prioridade sobre subtra��o
		
		double fahrenheit = 68;
		final int ajuste = 32;
		double celsius = (fahrenheit - ajuste) / 1.8;
		
		System.out.println(celsius);
	}
}
