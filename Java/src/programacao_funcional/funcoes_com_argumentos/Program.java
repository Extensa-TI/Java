package programacao_funcional.funcoes_com_argumentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
	
	/*
	 * Fazer um programa que, a partir de uma lista de produtos, calcule a
	 * soma dos preços somente dos produtos cujo nome começa com "T"
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));
		
		ProductService ps = new ProductService();
		
		//double sum = ps.filteredSum(list, p-> p.getName().charAt(0) == 'T');
		double sum = ps.filteredSum(list, p-> p.getPrice() >= 100.0);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
