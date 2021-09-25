package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenarStrings {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("Lasanha");
		palavras.add("Maça");
		palavras.add("Sorvete");
		
		//Forma antiga
		Collections.sort(palavras);
		System.out.println(palavras);
		
		System.out.println("--------");
		
		//Com comparator
		Comparator<String> comparador = new ComparadorPorTamanho(); 
		Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		System.out.println("--------");
		
		//Java 8, faz a mesma ação, direto na lista
		palavras.sort(comparador);
		System.out.println(palavras);
		
		System.out.println("--------");

		//Métodos com corpo dentro de interfaces, se chamam default methods 
		//(possuem essa assinatura). Permite que adicione um novo método em uma
		//interface e que esse método seja concreto e herdado. Não é como uma 
		//classe abstrata. Uma interface pode evoluir sem quebrar compatibilidade
		
		//Exibir elementos, antes
		for (String p : palavras) {
			System.out.println(p);
		}
		
		System.out.println("--------");
		
		//Java 8
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
	}
	
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}