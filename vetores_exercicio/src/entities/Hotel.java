package entities;

public class Hotel {
	
	private int rent;
	private String name;
	private String email;
	
	public Hotel(int rent, String name, String email) {
		this.rent = rent;
		this.name = name;
		this.email = email;
	}
	
	

	public int getRent() {
		return rent;
	}



	public void setRent(int rent) {
		this.rent = rent;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}
