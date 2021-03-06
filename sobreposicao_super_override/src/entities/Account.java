package entities;

public class Account {
	
	private Integer number;
	private String Holder;
	protected Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		Holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withDraw (double amount) {
		balance -= amount + 5;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
