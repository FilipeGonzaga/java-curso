package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("OutSourced (y/n)?");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				// podemos instanciar dessa forma, ja adicionando à lista
				list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {

				// Formato padrão de instancia / ambas corretas
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}

			System.out.println();
			System.out.println("PAYMENTS: ");

		}

		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));

		}
		sc.close();
	}

}
