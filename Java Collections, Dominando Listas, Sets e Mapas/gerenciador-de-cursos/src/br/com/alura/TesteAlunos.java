package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {
		// SET - conjunto
		// Elementos não ficam na ordem em que foram inseridos, ordem aleatória
		// Não é possível acessar com get justamente por não saber qual elemento de cada posição
		Set<String> alunos  = new HashSet<>();
		alunos.add("Maria");
		alunos.add("João");
		alunos.add("Sarah");
		alunos.add("Henrique");
		alunos.add("Clara");
		alunos.add("Roberto");
		
		System.out.println(alunos);
		
		// Não aceita elementos repetidos
		// Para ver cada elemento separadamente, com foreach
		alunos.forEach(aluno -> System.out.println(aluno));
		
		// Vantagem: velocidade e performance
		// Usa tabela de espalhamento
		// Velocidade de busca
		
		// Remove por objeto e não posição
		alunos.remove("Maria");

	}

}
