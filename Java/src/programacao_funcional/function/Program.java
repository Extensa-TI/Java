package programacao_funcional.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
	
	/*
	 * Fazre um programa que, a partir de uma lista de produtos, gere uma
	 * nova lista contendo os nomes dos produtos em caixa alta.
	 * Função map (Não confunda com a estrautura de dados Map) é uma função que aplica uma função
	 * a todos elementos de uma stream.
	 * Conversões:
	 * List para stream: .stream
	 * Stream para List: .collect(Collectors.toList())
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.00));
		
		
		
		//Implementação da interface
		//List<String> nomes = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//Com método static na classe Product
		//List<String> nomes = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

		//Com método na classe Product
		//List<String> nomes = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//Expressão lambda declarada
		//Function<Product,String> func = p-> p.getName().toUpperCase();
		//List<String> nomes = list.stream().map(func).collect(Collectors.toList());
		
		//Expressão lambda inline
		List<String> nomes = list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);
	}

}
