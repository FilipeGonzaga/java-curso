package funcoesString;

import java.util.Scanner;

//toUpperCase = MAIUSCULO
//tolowerCase = minusculo
//trim = sem espa�os vazios laterais
//substring(2) = inicia ap�s a segunda string/ tamb�m seleciona o limite que vc quer de caracteres
//replace () = troca de caracteres
//indexOf() = posi��o da string 
//split = recorte de string

/*Coment�rio de bloco*/

public class Strings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		frase = sc.nextLine();
		frase = frase.toUpperCase();
		
		System.out.println(frase);
		sc.close();
		
	}

}
