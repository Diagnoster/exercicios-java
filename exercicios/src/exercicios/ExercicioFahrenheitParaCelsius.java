package exercicios;

public class ExercicioFahrenheitParaCelsius {

	public static void main(String[] args) {
		//atencão para a prioridade de calculo, colocar parenteses pois a divisão tem prioridade sobre subtração
		
		double fahrenheit = 68;
		final int ajuste = 32;
		double celsius = (fahrenheit - ajuste) / 1.8;
		
		System.out.println(celsius);
	}
}
