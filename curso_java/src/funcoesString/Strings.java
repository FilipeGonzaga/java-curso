package funcoesString;

import java.util.Scanner;

//toUpperCase = MAIUSCULO
//tolowerCase = minusculo
//trim = sem espaços vazios laterais
//substring(2) = inicia após a segunda string/ também seleciona o limite que vc quer de caracteres
//replace () = troca de caracteres
//indexOf() = posição da string 
//split = recorte de string

/*Comentário de bloco*/

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
