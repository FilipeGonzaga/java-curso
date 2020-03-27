package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Boxing
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		//Unboxing
		int y = (int) obj;
		System.out.println(y);
		
		//Cada tipo Primitivo possui um OBJ em JAVA
		//Wrapper
		int z = 20;
		Integer objet = z;
		System.out.println(objet);
		
		//Colocar sempre do tipo Classe pois acecitam valores nulos
		
		
		sc.close();
		
	}

}
