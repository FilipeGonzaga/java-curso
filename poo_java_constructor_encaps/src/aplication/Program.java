package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		//Utilizando constructor com 3 parametros
		//  System.out.print("Quantity in stock: ");
		// int quantity = sc.nextInt();
		//Product product = new Product(name, price, quantity);
		
		//Utilizando sobrecarga 2 parametros
		Product product = new Product(name, price, 0);
		
		//Chamando metodo setName pra alterar name da Classe
		product.setName("Computer");
		//Chamando metodo Get para acessar o name
		System.out.println("Update name: " + product.getName());		
		
		//Chamando metodos get e set para acessar private 
		product.setPrice(950.00);
		System.out.println("Update price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}