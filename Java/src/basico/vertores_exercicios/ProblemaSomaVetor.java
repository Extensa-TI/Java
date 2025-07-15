package basico.vertores_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {

	/*
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida
	 * Imprimir todos os elemento do vetor
	 * Mostrar na tela a soma e a média dos elementos do vetor
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		media = soma/n;
		
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MÉDIA = %.2f\n", media);
		sc.close();
	}
}
