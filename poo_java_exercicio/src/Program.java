import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		Employee employee;
		employee = new Employee();
		
		employee.width = sc.nextDouble();
		employee.height = sc.nextDouble();
		
		double Area = employee.area();
		double Perimeter = employee.perimeter();
		double Diagonal = employee.diagonal();
		
		System.out.printf("AREA: %.2f %n", Area);
		System.out.printf("PERIMETER: %.2f %n", Perimeter );
		System.out.printf("DIAGONAL: %.2f %n", Diagonal);
		
		sc.close();
	}

}
