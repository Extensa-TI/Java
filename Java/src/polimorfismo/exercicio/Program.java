package polimorfismo.exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*
	 * Fazer um programa para ler os dados de N produtos. Ao final, mostrar a etiqueta de
	 * preço de cada produto na mesma ordem em que foram digitados.
	 * Todo produto possui um nome e preço. Produtos importados possuem uma taxa de alfândega
	 * produtos usados possuem data de fabricação.
	 * Esses dados específicos devem ser acrescentados na etiqueta de preço.
	 * Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do produto #" + (i + 1) + ":");
			System.out.print("Comum, usado, importado (c,u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new Product(name,price));
			}
			else if (type == 'u' ){
				System.out.print("Data de fabricação (DD/MM/YYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name,price,date));
			}
			else {
				System.out.print("Taxa de importação: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name,price,customFee));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
