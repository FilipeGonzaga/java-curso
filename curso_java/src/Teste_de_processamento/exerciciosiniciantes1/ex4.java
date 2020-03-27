package Teste_de_processamento.exerciciosiniciantes1;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int num, numHoraTrab;
		double valorHora, salario;
		
		num = sc.nextInt();
		numHoraTrab = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = numHoraTrab * valorHora;
		
		System.out.println("Number = " + num);
		System.out.printf("Salary = U$ %.2f %n", salario);
		
		
		sc.close();

	}

}
