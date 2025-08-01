package programacao_funcional.predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

	// Interface Funcional
	
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
