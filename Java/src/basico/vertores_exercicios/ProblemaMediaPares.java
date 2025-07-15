package basico.vertores_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPares {
	
	/*
	 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
	 * aritmética somente dos números pares lidos, com uma casa decimal. Se nehum número par for digitado
	 * morstrar a mensagem "NENHUM NUMERO PAR".
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, somapares = 0, npares = 0;
		double mediapares;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i< n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i = 0; i< n; i++) {
			if(vetor[i] % 2 == 0) {
				somapares += vetor[i];
				npares++;
			}
		}
		
		if(npares == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}
		else
		{
			mediapares = (double) somapares/npares;
			System.out.printf("MEDIA DOS PARES = %.1f\n",mediapares);
		}
		sc.close();

	}

}
