package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAula {

	// ArrayLsit com objetos Aula
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayList", 21);
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		// Imprime a referência do objeto se não sobrescrever o toString.
		// Como sobrescrevemos o toString na classe Aula,
		// agora, imprime corretamente os atributos 
		System.out.println(aulas);
		
		// Só é possível realizar a ordenação devido a sobrescrita
		// do método compareTo na classe do objeto e o fato da classe
		// implementar Comparable
		Collections.sort(aulas);
		System.out.println(aulas);
		
		// Além da lista, é possível passar o critério de comparação 
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		// A partir do Java 8, dá pra chamar direto na lista
		aulas.sort(Comparator.comparing(Aula::getTempo));
	}

}
