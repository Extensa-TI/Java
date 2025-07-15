package basico.vertores_exercicios;

import java.util.Scanner;

public class ProblemaNumeroPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,qtdPares;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNÚMEROS PARES");
		
		qtdPares = 0;
		for(int i = 0; i < n; i++) {
			if(vetor[i] %2 == 0) {
				System.out.printf("%d ",vetor[i]);
				qtdPares++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdPares);
		sc.close();
	}

}
