package basico.matrizes_exercicio;

import java.util.Scanner;

public class Program {
	
	/*
	 * Fazer um programa para dois números inteiros M e N, e depois ler
	 * uma matriz de M linhas por N colunas contendo números inteiros, podendo
	 * haver repetições. Em seguida, ler um número inteiro X que pertece à matriz.
	 * Para cada ocorrência de X, mostrar os valores à esquer, acima, à direita e abaixo
	 * de X, quando houver.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
	
}
