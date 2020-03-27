package Teste_de_processamento.exerciciosiniciantes1;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A, B, C, area, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;
				
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		
		area =  (A * C) / 2;
		circulo = (float) (pi *  Math.pow(C, 2.0));
		trapezio = (A + B) * C / 2;
		quadrado =  (float) Math.pow(B, 2.0);
		retangulo = A * B;
		
		System.out.printf("Triangulo = %.3f %n", area);
		System.out.printf("CIRCULO = %.3f %n", circulo);
		System.out.printf("TRAPEZIO = %.3f %n", trapezio);
		System.out.printf("QUADRADO = %.3f %n", quadrado);
		System.out.printf("RETANGULO = %.3f %n", retangulo);
		
		sc.close();
	}

}
