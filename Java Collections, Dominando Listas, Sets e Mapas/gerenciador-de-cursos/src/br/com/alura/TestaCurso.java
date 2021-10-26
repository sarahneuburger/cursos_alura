package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas); // Está vazio
		
		// Antes, utilizando os métodos da lista, acaba "burlando" a autoridade da classe Curso,
		// mexendo em métodos privados. Vai estourar exceção devido a trativa criada na classe Curso.
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21)
		// Depois
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 30));
		javaColecoes.adiciona(new Aula("Modelando com listas", 20));
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		List<Aula> aulas2 = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas2); 
		// para conseguir ordenar uma lista imutável, tem que passá-la no construtor para atribuí-la
		// a uma lista "cópia" onde é possível mexer
		System.out.println(aulas2); // Agora tem os itens adicionados
		
		// Tempo total, método criado na classe Curso
		System.out.println(javaColecoes.getTempoTotal());
		
		// Imprimindo o método toString que foi sobrescrito
		System.out.println(javaColecoes.toString());
	}

}
