package classes_abstratas.exercicio;

public class Individual extends TaxPayer {

	private Double healtExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIcome, Double healtExpenditures) {
		super(name, anualIcome);
		this.healtExpenditures = healtExpenditures;
	}

	public Double getHealtExpenditures() {
		return healtExpenditures;
	}

	public void setHealtExpenditures(Double healtExpenditures) {
		this.healtExpenditures = healtExpenditures;
	}

	@Override
	public double tax() {
		double basicTax;
		if (getAnualIcome() < 20000.00) {
			basicTax = getAnualIcome() * 0.15;
		}
		else {
			basicTax = getAnualIcome() * 0.25;
		}
		basicTax -= getHealtExpenditures() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

	
	
}
