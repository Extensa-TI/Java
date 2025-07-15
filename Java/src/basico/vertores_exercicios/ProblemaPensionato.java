package basico.vertores_exercicios;

import java.util.Scanner;

public class ProblemaPensionato {
	
	/*
	 * A dona de um pensionato possui dez quartos para alugar para estudantes,
	 * sendo esses quartos identificados pelos número 0 a 9.
	 * 
	 * Fazer um programa que inicie com todos o dez quartos vazios, e depois leia
	 * uma quantidade N representando o número de estudantes que vão alugar quartos
	 * (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para
	 * cada registro de aluguel, informar nome e email do estudante  bem
	 * como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um 
	 * quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações
	 * do pensionato, por ordem de quarto.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name,email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
