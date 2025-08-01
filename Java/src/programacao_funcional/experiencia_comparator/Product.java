package programacao_funcional.experiencia_comparator;

//public class Product implements Comparable<Product> {
public class Product {
	
	private String name;
	private Double price;

	public Product() {
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

//	@Override
//	public int compareTo(Product o) {
//		return name.toUpperCase().compareTo(o.getName().toUpperCase());
//	}
}
