package br.com.alura;

public class TesteBuscaAlunoNoCurso {

	public static void main(String[] args) {
		// Trabalhando com mapas
		
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
		
		System.out.println("Quem é o aluno com matricula 123?");
		// Verificação realizada com o map
		Aluno aluno = javaColecoes.buscaMatriculado(123);
		System.out.println(aluno);

	}

}
