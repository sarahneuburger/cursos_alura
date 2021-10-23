package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

// ArrayList
public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cusos e Sets";
		
		// Adicionar
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		// Remover
		aulas.remove(0);
		System.out.println(aulas);
		
		// Imprimindo cada item da lista separadamente
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		// Primeiro elemento da lista
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula �: " + primeiraAula);
		
		
		// Tamanho
		System.out.println(aulas.size());
		
		// Foraech na pr�pria classe do ArrayList
		// Implementa��o da classe Consumer
		aulas.forEach(aula -> System.out.println(aula));
		
		// Collections, classe auxiliar com m�todos est�ticos para
		// trabalhar com cole��es
		aulas.add("Aumentando nosso conhecimentos");
		Collections.sort(aulas);
		System.out.println("Depois de ordenado... ");
		System.out.println(aulas);
	}

}
