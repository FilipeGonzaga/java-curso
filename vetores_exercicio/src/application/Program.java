package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
	
		Hotel [] vect = new Hotel [10];
			
		System.out.print("Digite a quantidade de quartos: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int rent = i + 1;
			System.out.println("Rent #" + rent);
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();

			
			System.out.print("Digite o numero do quarto: ");
			vect[sc.nextInt()] = new Hotel(rent, name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
		System.out.println("Rent:  #" + vect[i].getRent());
		System.out.println("Name: " + vect[i].getName());
		System.out.println("Email: " + vect[i].getEmail());
		System.out.println("Room: " + i);
			}
		}
		
		
		
		sc.close();
		
	}

}
