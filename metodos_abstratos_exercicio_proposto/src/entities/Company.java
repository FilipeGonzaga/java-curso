package entities;

public class Company extends TaxaPayer {

	private Integer numberberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberberOfEmployees) {
		super(name, anualIncome);
		this.numberberOfEmployees = numberberOfEmployees;
	}

	public Integer getNumberberOfEmployees() {
		return numberberOfEmployees;
	}

	public void setNumberberOfEmployees(Integer numberberOfEmployees) {
		this.numberberOfEmployees = numberberOfEmployees;
	}

	@Override
	public double Tax() {
		if (numberberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}

}
