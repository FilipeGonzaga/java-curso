package Teste_de_processamento;

import java.util.Scanner;

public class entrada_de_dados {

			public static void main(String[] args) {
				
				//Intera��o com string
				String x;
				
				Scanner sc = new Scanner (System.in);
				
				x = sc.next();
				System.out.println("voc� digitou o valor: " + x);
				
				//Intera��o com inteiro
				
				int y;

				y = sc.nextInt();
				System.out.println("voc� digitou o valor: " + y);
				
				//Intera��o com Double
				
				double a;

				a = sc.nextDouble();
				System.out.println("voc� digitou o valor: " + a );
				
				//Intera��o com Char
				
				char c;

				c = sc.next().charAt(0);
				System.out.println("voc� digitou o valor: " + c );
				
				//Intera��o variadas
				
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
