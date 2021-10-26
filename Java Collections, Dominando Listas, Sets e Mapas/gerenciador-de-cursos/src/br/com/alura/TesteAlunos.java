package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {
		// SET - conjunto
		// Elementos n�o ficam na ordem em que foram inseridos, ordem aleat�ria
		// N�o � poss�vel acessar com get justamente por n�o saber qual elemento de cada posi��o
		Set<String> alunos  = new HashSet<>();
		alunos.add("Maria");
		alunos.add("Jo�o");
		alunos.add("Sarah");
		alunos.add("Henrique");
		alunos.add("Clara");
		alunos.add("Roberto");
		
		System.out.println(alunos);
		
		// N�o aceita elementos repetidos
		// Para ver cada elemento separadamente, com foreach
		alunos.forEach(aluno -> System.out.println(aluno));
		
		// Vantagem: velocidade e performance
		// Usa tabela de espalhamento
		// Velocidade de busca
		
		// Remove por objeto e n�o posi��o
		alunos.remove("Maria");

	}

}
