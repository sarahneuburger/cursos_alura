package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Lasanha");
		palavras.add("Ma�a");
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

		// Interface funcional, possui apenas um m�todo abstrato, utilizada em lambdas
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
		
		
		// Mesma vers�o acima, mais suscinta. Utiliza o Integer para comparar os ints,
		// n�o necessitando das valida��es acima
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		// Method reference
		// A classe Comparator j� possui m�todos que tamb�m recebem lambas (interface 
		// function) como par�metro melhorando ainda mais o c�digo
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length)); // outra forma, dada uma string, 
															// chama o length da mesma
		
		System.out.println(palavras);

		System.out.println("--------");

		// M�todos com corpo dentro de interfaces, se chamam default methods
		// (possuem essa assinatura). Permite que adicione um novo m�todo em uma
		// interface e que esse m�todo seja concreto e herdado. N�o � como uma
		// classe abstrata. Uma interface pode evoluir sem quebrar compatibilidade

		// Exibir elementos, antes
		for (String p : palavras) {
			System.out.println(p);
		}

		System.out.println("--------");

		// Java 8
		// Classe an�nima com lamba, tem que ser curta e sem aproveitamento de c�digo
		// Por baixo, cria a classe Consumer e seu m�todo accept
		// Caso seja apenas um atributo e m�todo, n�o precisa especificar tipo e colocar {}
		palavras.forEach(s ->
			System.out.println(s)
		);
		
		System.out.println("--------");
		
		// Method reference
		palavras.forEach(System.out::println);
	}

}