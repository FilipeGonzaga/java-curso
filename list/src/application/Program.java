package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		//Criando Lista com a Classe Arraylist
		List<String> list = new ArrayList<>();
		
		//Adicionando a Lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		//Mostrando Tamanho da Lista
		System.out.println(list.size());
		
		//Imprimindo Lista
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		
		//Removendo Lista por posição
		//list.remove(4);
		
		//Removendo Posições por Predicado / Função Lambda
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		
		//Imprimindo por posição
		System.out.println("Index Bob: " + list.indexOf("Bob"));
		System.out.println("Index Marco: " + list.indexOf("Marco"));
		
		System.out.println("----------------------");
		
		//Filtrando elementos com a letra:  A   /Stream a partir do 8 permite filtro de lista
		//Filter permite Predicado //Função Lambda
		//Collector COnverte Novamente para lista
	 	List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	 	for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		
		//findFirst pega o 1o elemento retorna opcional String //Nulo 
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
