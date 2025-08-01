package basico.vertores_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMaiorPosicao {

	/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela:
	 * O maior número do vetor(supor não haver empate)
	 * Mostrar também a posição do maior elemento, considerando a primeira posiçao como 0(zero).
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
		double maior;
		
		System.out.print("Quando números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i<n;i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		maior = vetor[0];
		posmaior = 0;
		
		for(int i = 0; i < n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n",maior);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n",posmaior);
		sc.close();
		
	}

}
