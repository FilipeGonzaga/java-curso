
import java.util.Locale;

public class Main {
	
	//%f = ponto flutuante
	// %d = inteiro
	// %s = texto
	// %n = quebra de linha

	public static void main(String[] args) {
		double y = 32.2564;
		String nome = "Maria";
		int idade = 40;
		double renda = 4000.0;
		
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", y);
		System.out.println("Bom dia");
		
		System.out.println("Resultado = " + y + " METROS");
		
		System.out.printf("Resultado = %.2f metros%n", y);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
