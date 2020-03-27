package entities;

public class Product {

	// Quando não há declaração de public ou private
	// o atributo pode ser acessado quando está no mesmo pacote
	String name;
	private double price;
	private int quantity;

	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}

/*
 * 
 * 
 * //Contructor Default public Product () { }
 * 
 * //Constructor Personalizado public Product (String name, double price, int
 * quantity) { this.name = name; this.price = price; this.quantity = quantity;
 * 
 * }
 * 
 * //Constructor Sobrecarga / Parametro a menos public Product (String name,
 * double price) { this.name = name; this.price = price; }
 * 
 * //Acessando atributo name, através do metodo get public String getName () {
 * return name; }
 * 
 * //Passando valor name Privado, através do metodo set, passando por parametro
 * public void setName (String name) { this.name = name; }
 * 
 * public double getPrice () { return price; }
 * 
 * public void setPrice (double price) { this.price = price; }
 * 
 * public int getQuantity () { return quantity; }
 * 
 */