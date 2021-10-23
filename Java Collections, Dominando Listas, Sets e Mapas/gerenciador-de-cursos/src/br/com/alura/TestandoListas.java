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
		System.out.println("A primeira aula é: " + primeiraAula);
		
		
		// Tamanho
		System.out.println(aulas.size());
		
		// Foraech na própria classe do ArrayList
		// Implementação da classe Consumer
		aulas.forEach(aula -> System.out.println(aula));
		
		// Collections, classe auxiliar com métodos estáticos para
		// trabalhar com coleções
		aulas.add("Aumentando nosso conhecimentos");
		Collections.sort(aulas);
		System.out.println("Depois de ordenado... ");
		System.out.println(aulas);
	}

}
