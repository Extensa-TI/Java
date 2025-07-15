package basico.listas.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*
	 * Fazer um programa para ler um número N e depois os dados (id,nome e salário) de N funcionarios.
	 * Não deve haver repetição de id
	 * Em seguida, efetuar um aumento de x por cento no salário de um determinado funcionario.
	 * Para isso, o programa deve ler um id e o valor x. Se o ID informado não existir, mostrar uma 
	 * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários.
	 * 
	 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
	 * Um salário só pode ser alterado com base em uma operação de aumento por porcentagem dada.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + i+1 + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id,name,salary);
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x->x.getId() == idsalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
