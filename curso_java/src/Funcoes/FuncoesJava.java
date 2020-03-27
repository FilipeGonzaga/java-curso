package Funcoes;

import java.util.Scanner;

public class FuncoesJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter trhee numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//Função
		int higher = max(a, b, c);
		
		//Função
		showResult(higher);

		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {
			aux = x;
		} else if (y > x && y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
