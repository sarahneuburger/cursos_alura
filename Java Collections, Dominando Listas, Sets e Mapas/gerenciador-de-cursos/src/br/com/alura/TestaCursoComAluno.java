package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 30));
		javaColecoes.adiciona(new Aula("Modelando com listas", 20));

		Aluno a1 = new Aluno("Sarah", 123);
		Aluno a2 = new Aluno("Carlos", 321);
		Aluno a3 = new Aluno("Marta", 654);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Alunos matriculados");
		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		/**
		 * Uma das características mais interessantes de JVM é que ela sabe trabalhar em paralelo.
		 * Internamente isso é feito por meio de Threads que funcionam como pequenos processos 
		 * dentro da JVM.
		 * O problema é que as coleções que estamos usando até agora não foram feitas para serem 
		 * manipuladas em paralelo. No entanto, nada impede que usemos um método da classe 
		 * Collections para transformar uma coleção comum em uma coleção para threads. 
		 * É justamente isso que o método faz, retorna um nova coleção que pode ser compartilhada 
		 * entre threads sem perigos.
		 */
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
		
		System.out.println(javaColecoes.estaMatriculado(a1));
	
		// Se dois objetos são equals, obrigatoriamente possuem o mesmo hashCode
		Aluno comparativo = new Aluno("Sarah", 123);
		System.out.println(a1.equals(comparativo));
		System.out.println(a1.hashCode() == comparativo.hashCode());
	
		
		// Iterator, iteração disponível antes do foreach
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno next = iterador.next();
			System.out.println(next);
			
		}
				
		// LinkedHashSet nos dá a performance de um HashSet mas com acesso previsível e ordenado.
		
		// TreeSet: Para adicionarmos um objeto em um TreeSet ele precisa implementar a interface 
		// Comparable. Mas o que fazer se estamos trabalhando com uma instância de uma classe que 
		// não temos acesso ou não podemos modificar para implementar Comparable? Nesse caso, o 
		// construtor do TreeSet recebe como parâmetro um objeto que implementa Comparator. Dessa
		// forma, o critério de comparação pode ser criado em separado da classe na qual opera.
		
		// Collections classes que implementam ou são filhas da interface Collection.
		// Conjunto de objetos.
	}

}
