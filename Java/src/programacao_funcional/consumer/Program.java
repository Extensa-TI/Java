package programacao_funcional.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//import java.util.function.Consumer;

//import ProgramacaoFuncional_ExpressoesLambda.Consumer.util.PriceUpdate;

public class Program {
	
	/*
	 * Fazer um programa que, a partir de uma lista de produtos, aumente o 
	 * preço dos produtos em 10%
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));
		
		// Implementando uma interface
		//list.forEach(new PriceUpdate());
		
		// Método static na classe Product
		//list.forEach(Product::staticPriceUpdate);
		
		// Método da classe Product
		//list.forEach(Product::nonStaticPriceUpdate);
		
		// Expresão lambda declarada
		double factor = 1.1;
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		//list.forEach(cons);
		
		// Expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out::println);
	}
}
