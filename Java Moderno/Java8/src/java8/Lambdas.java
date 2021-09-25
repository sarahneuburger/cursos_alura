package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Lasanha");
		palavras.add("Maça");
		palavras.add("Sorvete");

		// Forma antiga
		Collections.sort(palavras);
		System.out.println(palavras);

		System.out.println("--------");

		// Com comparator
		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);

		System.out.println("--------");

		// Interface funcional, possui apenas um método abstrato, utilizada em lambdas
		// Java 8
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			}
			if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});
		
		
		// Mesma versão acima, mais suscinta. Utiliza o Integer para comparar os ints,
		// não necessitando das validações acima
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		// Method reference
		// A classe Comparator já possui métodos que também recebem lambas (interface 
		// function) como parâmetro melhorando ainda mais o código
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length)); // outra forma, dada uma string, 
															// chama o length da mesma
		
		System.out.println(palavras);

		System.out.println("--------");

		// Métodos com corpo dentro de interfaces, se chamam default methods
		// (possuem essa assinatura). Permite que adicione um novo método em uma
		// interface e que esse método seja concreto e herdado. Não é como uma
		// classe abstrata. Uma interface pode evoluir sem quebrar compatibilidade

		// Exibir elementos, antes
		for (String p : palavras) {
			System.out.println(p);
		}

		System.out.println("--------");

		// Java 8
		// Classe anônima com lamba, tem que ser curta e sem aproveitamento de código
		// Por baixo, cria a classe Consumer e seu método accept
		// Caso seja apenas um atributo e método, não precisa especificar tipo e colocar {}
		palavras.forEach(s ->
			System.out.println(s)
		);
		
		System.out.println("--------");
		
		// Method reference
		palavras.forEach(System.out::println);
	}

}