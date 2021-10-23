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
		
		// Imprime a refer�ncia do objeto se n�o sobrescrever o toString.
		// Como sobrescrevemos o toString na classe Aula,
		// agora, imprime corretamente os atributos 
		System.out.println(aulas);
		
		// S� � poss�vel realizar a ordena��o devido a sobrescrita
		// do m�todo compareTo na classe do objeto e o fato da classe
		// implementar Comparable
		Collections.sort(aulas);
		System.out.println(aulas);
		
		// Al�m da lista, � poss�vel passar o crit�rio de compara��o 
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		// A partir do Java 8, d� pra chamar direto na lista
		aulas.sort(Comparator.comparing(Aula::getTempo));
	}

}
