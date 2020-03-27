package repeticao;

import java.util.Scanner;

public class for_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0;

		int x = sc.nextInt();

		for (int y = 0; y < x; y++) {

			soma += sc.nextInt();

		}
		System.out.println(soma);
		sc.close();
	}

}
