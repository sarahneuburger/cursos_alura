package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

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
		 * Uma das caracter�sticas mais interessantes de JVM � que ela sabe trabalhar em paralelo.
		 * Internamente isso � feito por meio de Threads que funcionam como pequenos processos 
		 * dentro da JVM.
		 * O problema � que as cole��es que estamos usando at� agora n�o foram feitas para serem 
		 * manipuladas em paralelo. No entanto, nada impede que usemos um m�todo da classe 
		 * Collections para transformar uma cole��o comum em uma cole��o para threads. 
		 * � justamente isso que o m�todo faz, retorna um nova cole��o que pode ser compartilhada 
		 * entre threads sem perigos.
		 */
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
		
		System.out.println(javaColecoes.estaMatriculado(a1));
	
		// Se dois objetos s�o equals, obrigatoriamente possuem o mesmo hashCode
		Aluno comparativo = new Aluno("Sarah", 123);
		System.out.println(a1.equals(comparativo));
		System.out.println(a1.hashCode() == comparativo.hashCode());
	
	}

}
