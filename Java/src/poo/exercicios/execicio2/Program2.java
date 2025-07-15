package poo.exercicios.execicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
	
	/*
	 * Fazer um programa para ler os dados de um funcionário(nome, salário bruto e imposto). Em
	 * seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
	 * salário do funcionário com base em uma percentagem data (somente o salário bruto é afetado
	 * pela porcentagem) e mostrar novamente os dados do funcionário. 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax =  sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp.name);
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
		
		
	}

}
