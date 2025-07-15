package classes_abstratas.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
	 * Fazer um programa para ler os dados de N contribuintes, os quais podem ser pessoa física ou pessoa jurídica,
	 * e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.
	 * Os dados de pessoa física são: nome, renda anual e gastos com saúde.
	 * Os dados de pessoa jurídica são: nome, renda anual e número de funcionários.
	 * As regras para cálculo de imposto são as seguintes:
	 * Pessoa física: 
	 * pessoas cuja renda foi abaixo de 20.000,00 pagam 15%
	 * pessoas com renda de 20.000,00 em diante pagam 25%
	 * Se a pessoa teve gastos com saúde, 50% desses gastos são abatidos no imposto
	 * 
	 * Pessoa Jurídica:
	 * Pessoas jurídicas pagam 16%. Porém, se a empresa possui mais de 10 funcionários, ela paga 14%
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of taxpayers: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Taxpayer #" + i + " data:");
			System.out.print("Individual or company (i/c))?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual icome: ");
			Double anualIcome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Healt expenditures: ");
				Double healtExpenditures = sc.nextDouble();
				list.add(new Individual(name,anualIcome,healtExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name,anualIcome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
		
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
