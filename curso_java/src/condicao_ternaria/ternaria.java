package condicao_ternaria;

import java.util.Scanner;

public class ternaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String y;

		System.out.println("Digite um valor");
		x = sc.nextInt();

		y = (x < 50) ? "Menor que 50" : "Maior que 50";

		System.out.println(y);

		sc.close();

	}

}
