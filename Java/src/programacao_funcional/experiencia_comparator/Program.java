package programacao_funcional.experiencia_comparator;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	/*
	 * Problema
	 * - Suponha uma classe Product com os atributos name e price.
	 * - Podemos implementar a comparação de protudos por meio da
	 *   implementação da interface Comparable<Product>
	 * - Entretanto, dessa forma nossa classe não fica fechada para alteração:
	 *   se o critério de comparação mudar, precisaremos alterar a classe Product
	 * - Podemos então usar o default method 'Sort' da interface List
	 *   default void sort(Comparator<? super E> c)
	 */

	public static void main(String[] args) { 

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
//		Comparator<Product> comp = new Comparator<Product>( ) {
//
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//			
//		};
		

//		Comparator<Product> comp = (p1,p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};

//		Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		//		list.sort(new MyComparator());
		//list.sort(comp);
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
	
		for (Product p :list) {
			System.out.println(p);
		}
	}
}
