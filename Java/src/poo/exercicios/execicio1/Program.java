package poo.exercicios.execicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*
	 * Fazer um programa para ler os valores de largura e altura
	 * de um retângulo. Em seguida, mostrar na tela o valor de 
	 * sua área, perímetro e diagonal. Usar uma classe.
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERMITER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();
	}

}
