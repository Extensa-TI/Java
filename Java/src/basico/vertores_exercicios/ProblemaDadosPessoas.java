package basico.vertores_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDadosPessoas {
	
	/*
	 * Tem-se um conjunto de dados contendo a altura e o gênero(M,F) de N Pessoas. Fazer um
	 * programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres
	 * e o número de homens.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdhomens,qtdmulheres;
		double menoraltura, maioraltura,alturafemmedia, alturafemtotal;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		double[] alturas = new double[n];
		char[] generos = new char[n];
		
		for(int i = 0; i< n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genêro da %da pessoa: ", i+1);
			generos[i] = sc.next().charAt(0);
		}
		
		menoraltura = alturas[0];
		maioraltura = alturas[0];
		
		for(int i = 0; i< n; i++) {
			if (alturas[i] > maioraltura) {
				maioraltura = alturas[i];
			}
			if(alturas[i] < menoraltura) {
				menoraltura = alturas[i];
			}
		}

		qtdhomens = 0;
		qtdmulheres = 0;
		alturafemtotal = 0;
		for(int i = 0; i< n; i++) {
			if (generos[i] == 'M') {
				qtdhomens++;
			}
			else
			{
				qtdmulheres++;
				alturafemtotal += alturas[i];
			}
		}
		
		alturafemmedia = alturafemtotal / qtdmulheres;
		
		System.out.printf("Menor altura = %.2f\n", menoraltura);
		System.out.printf("Maior altura = %.2f\n", maioraltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemmedia);
		System.out.printf("Número de homens = %d\n",qtdhomens);
		sc.close();
	}

}
