package basico.vertores_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAprovados {
	
	/*
	 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como, as notas que eles
	 * tiraram no 1° e 2° semestres. Cada uma dessas informações deve ser armazeradas em um vetor.
	 * Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja mèdia
	 * das notas seja maior ou igual a(6.0) seis.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media;
		
		System.out.print("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];
		
		for(int i = 0; i< n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ",i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		for(int i = 0; i< n; i++) {
			media = (notas1[i] + notas2[1]) / 2;
			if(media >= 6.0) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		sc.close();
	}
}
