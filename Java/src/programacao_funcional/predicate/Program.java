package programacao_funcional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
	
	/*
	 * Fazer um programa que, a partir de uma lista de produtos, remova da
	 * lista somente aqueles cujo preço mínimo seja 100.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));
		
		// Primeira forma de usar: lambda in line (mais prática)
		double min = 100.0;
		list.removeIf(p->p.getPrice() >= min);
		
		// Segunda forma de usar: implementando a interface
		//list.removeIf(new ProductPredicate());
		
		// Terceira forma de usar: método static no classe product
		//list.removeIf(Product::staticProductPredicate);
		
		// Quarta forma de usar: método prório da classe product
		//list.removeIf(Product::noStaticProductPredicate);
		
		// Quinta forma de usar: criando uma variável tipo Predicate e utilizando lambda
		//Predicate<Product> pred = p -> p.getPrice() >= min;
		//list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
