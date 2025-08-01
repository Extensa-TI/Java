package polimorfismo.exercicio;

public class ImportedProduct extends Product {
	
	private Double customFee;

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customFee;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ " (used) $ "
				+ String.format("%.2f",totalPrice())
				+ " (Custom fee: $ "
				+ String.format("%.2f", customFee)
				+ ")";
	}
	

}
