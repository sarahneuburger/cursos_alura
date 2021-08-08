package br.com.caelum.livraria.dominio;

import org.javamoney.moneta.Money;
/**
 * Introduzir extensão local
 * 
 * Havia muita lógica a autor, mas em uma classe indevida.
 * Introduzida nova classe Autor, que terá todo o comportamento do mesmo.
 * 
 * Livro ficou apenas com as lógicas condizentes ao objeto.
 *
 */
public class Livro {
	
	private final String titulo;
	private final Autor autor;
	private final ISBN isbn;
	private final Money valor;
	
	public Livro(String titulo, Autor autor, ISBN isbn, Money valor) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.valor = valor;
	}
	
	public Money getValor() {
		return valor;
	}
	
	public String getValorFormatado() {
		return FormatadorUtils.getValorFormatado(valor);
	}
	
	public String getNome() {
		return titulo;
	}
	
	public String getISBN() {
		return isbn.toString();
	}
	
	public String getAutor() {
		return autor.getNome();
	}
	
	public String getUltimoSobrenomeDoAutor() {
		return autor.getUltimoSobrenomeDoAutor();
	}

}
