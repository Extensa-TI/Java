package programacao_funcional.calculo_lambda;

import java.util.Arrays;

public class TransparenciaReferencial {
	/*
	 * Uma função possui transparência referencial se o seu resultado for sempre o mesmo
	 * para os mesmos dados de entrada. Benefícios: simplicidade e previsibilidade
	 */
	public static int globalValue = 3;
	
	public static void main(String[] args) {
		
		int[] vect = new int[] {3,4,5};
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}
	
	public static void changeOddValues(int[] numbers) { //Não tem transparência referencial porque depende de fator externo (globalValue)
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] %2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}
