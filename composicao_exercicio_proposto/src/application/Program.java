package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String emailClient = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date dateClient = sdf.parse(sc.next());

		//Cliente instanciado
		Client client = new Client(nameClient, emailClient, dateClient);

		System.out.println("Enter order data: ");
		OrderStatus  statusOrder = OrderStatus.valueOf(sc.next());
		
		//Order Instanciada
		Order order = new Order(new Date(), statusOrder, client);

		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + "item data:");
			System.out.print("Product name:");
			String nameProduct = sc.next();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			
			Product product = new Product(nameProduct, priceProduct);
			
			System.out.println("Quantity:" );
			int quantityProduct = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);
			order.addItem(orderItem);
		}
		
		System.out.println();

		System.out.println("ORDER SUMMARY:");

		System.out.println(order);

		sc.close();
	}

}
