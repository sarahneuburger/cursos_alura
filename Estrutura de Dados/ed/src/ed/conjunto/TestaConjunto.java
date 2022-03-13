package ed.conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TestaConjunto {
	
	public static void main(String[] args) {
		
		LinkedList<String> conjuntoExemplo = new LinkedList<String>();
		// Para não adicionar dados duplicados, seria necessário validar antes
		if (!conjuntoExemplo.contains("Sarah")) {
			conjuntoExemplo.add("Sarah"); // Tempo linear, depende do tamanho do conjunto
		}
		
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Ana");
		System.out.println(conjunto);
		
		conjunto.adiciona("Bruna");
		System.out.println(conjunto);
		
		conjunto.adiciona("Amanda");
		System.out.println(conjunto);
		
		conjunto.remove("Ana");
		System.out.println(conjunto);
		
		// Interface Java
		Set<String> conjuntoDoJava = new HashSet<>();
		conjuntoDoJava.add("Joana");
		conjuntoDoJava.add("Darc");
		System.out.println(conjuntoDoJava);
		
		// O set espalha utilizando o hashCode da classe Object
		
	}

}
