package br.com.alura;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public int getTempo() {
		return tempo;
	}

	// Sobrescrita do toString da classe Object
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + 
				" minutos]";
	}
	
	// Sobrescrita compareTo
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
		// String já tem esse método, logo, não é necessário reimplementar
		// a lógica de comparação
	}
}
