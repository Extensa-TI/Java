package classes_abstratas.exercicio;

public abstract class TaxPayer {
	
	private String name;
	private Double anualIcome;
	
	public TaxPayer() {
		super();
	}

	public TaxPayer(String name, Double anualIcome) {
		super();
		this.name = name;
		this.anualIcome = anualIcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIcome() {
		return anualIcome;
	}

	public void setAnualIcome(Double anualIcome) {
		this.anualIcome = anualIcome;
	}
	
	public abstract double tax();
	

}
