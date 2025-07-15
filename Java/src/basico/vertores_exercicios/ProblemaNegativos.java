package basico.vertores_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNegativos {

	/*
	 * Faça um programa que leia um número inteiro positivo N(máximo=10) e depois N números inteiros
	 * e amazene-os em um vetor. Em seguida, mostrar na tela os números negativos lidos.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n",vetor[i]);
			}
		}
		sc.close();
	}
}
