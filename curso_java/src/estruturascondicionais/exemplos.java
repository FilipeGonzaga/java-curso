package estruturascondicionais;

import java.util.Scanner;

public class exemplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Qual a hora?");
		x = sc.nextInt();

		if (x > 0 && x < 12) {
			System.out.println("Bom dia");
		} else if (x >= 12 && x < 18) {

			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
	
		sc.close();
	}

}
