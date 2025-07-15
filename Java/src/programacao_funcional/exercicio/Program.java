package programacao_funcional.exercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	
	/*
	 * Fazer um programa para ler os dados (nome, email e salário)
	 * de funcionários a partir de um arquivo em formato .cvs
	 * Em seguida mostra, em ordem alfabética, o email dos funcionários
	 * cujo salário seja superior a um dado valor fornecido pelo usuário.
	 * Mostrar também a soma dos salários dos funcionários cujo nome
	 * começa com a letra M.
	 */
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        String path = "C:\\Users\\CASA\\OneDrive\\Documentos\\Estudos\\Java\\Java\\res\\programacao_funcional_fixacao.emplyoee.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line!= null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(x-> x.getSalary() > salary)
					.map(x-> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f",salary) + ":");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x-> x.getName().charAt(0) == 'M')
					.map(x-> x.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary from people whose name starts 'M': " + String.format("%.2f",sum));
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
