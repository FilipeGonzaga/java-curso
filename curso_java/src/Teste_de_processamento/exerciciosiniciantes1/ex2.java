package Teste_de_processamento.exerciciosiniciantes1;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, raio;
		double pi = 3.14159;
		
		
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2.0);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f", area);
		
		
		sc.close();

	}

}
