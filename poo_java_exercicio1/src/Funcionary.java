import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Funcionary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario;
		funcionario = new Employee();

		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		 funcionario.netSalary();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f", funcionario.name,  funcionario.netSalary());
		
		System.out.println();		
		System.out.println("Which percentage to increase salary?");
		
		double tax = sc.nextDouble();
		funcionario.increaseSalary(tax);
		
		System.out.println("Updated data: " + funcionario);
		sc.close();
	}

}
