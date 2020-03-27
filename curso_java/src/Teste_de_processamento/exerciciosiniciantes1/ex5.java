package Teste_de_processamento.exerciciosiniciantes1;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cdPeca1, nmPeca1, cdPeca2, nmPeca2;
		
		double vlUn1, vlUn2, valorPg;
		
		cdPeca1 = sc.nextInt();
		nmPeca1 = sc.nextInt();
		vlUn1 = sc.nextDouble();
		cdPeca2 = sc.nextInt();
		nmPeca2 = sc.nextInt();
		vlUn2 = sc.nextDouble();
		
		valorPg = (nmPeca1 * vlUn1) + (nmPeca2 * vlUn2);
		
		System.out.printf("VALOR A PAGAR: %.2f", valorPg);
		
		sc.close();
		
		
	}

}
