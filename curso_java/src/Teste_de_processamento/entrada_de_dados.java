package Teste_de_processamento;

import java.util.Scanner;

public class entrada_de_dados {

			public static void main(String[] args) {
				
				//Interação com string
				String x;
				
				Scanner sc = new Scanner (System.in);
				
				x = sc.next();
				System.out.println("você digitou o valor: " + x);
				
				//Interação com inteiro
				
				int y;

				y = sc.nextInt();
				System.out.println("você digitou o valor: " + y);
				
				//Interação com Double
				
				double a;

				a = sc.nextDouble();
				System.out.println("você digitou o valor: " + a );
				
				//Interação com Char
				
				char c;

				c = sc.next().charAt(0);
				System.out.println("você digitou o valor: " + c );
				
				//Interação variadas
				
				String e;
				int f;
				double g;
				e = sc.next();
				f = sc.nextInt();
				g = sc.nextDouble();

				System.out.println("Valores digitados: ");
				System.out.println(e);
				System.out.println(f);
				System.out.println(g);
				
				
				
				sc.close();
				
				

	}

}
