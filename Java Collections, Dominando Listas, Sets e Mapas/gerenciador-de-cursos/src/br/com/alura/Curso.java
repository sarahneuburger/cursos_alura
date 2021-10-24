package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String isntrutor;
	private List<Aula> aulas = new LinkedList<>();

	public Curso(String nome, String isntrutor) {
		this.nome = nome;
		this.isntrutor = isntrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return isntrutor;
	}

	public List<Aula> getAulas() {
		// Lista "read only", não pode ser alterada de fora
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " 
	+ aulas + "]";
	}

}
