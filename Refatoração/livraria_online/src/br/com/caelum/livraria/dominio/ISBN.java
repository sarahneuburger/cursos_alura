package br.com.caelum.livraria.dominio;
/**
 * Substituir método por objeto método
 * 
 * Normalmente a classe só possui um método e nome igual ao
 * do método que irá substituir.
 * Visa classes mais concisas.
 *
 */
public class ISBN {

	private final String numero;

	public ISBN(String isbn) {
		if(!validar(isbn)) 
			throw new IllegalArgumentException(String.format("ISBN invÃ¡lido: %s", isbn));
		this.numero = isbn;
	}

	private boolean validar(String isbn) {
		return new Validar(isbn).validar();
	}
	
	@Override
	public String toString() {
		return numero;
	}
}
