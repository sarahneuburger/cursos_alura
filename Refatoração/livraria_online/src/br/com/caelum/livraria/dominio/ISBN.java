package br.com.caelum.livraria.dominio;
/**
 * Substituir m�todo por objeto m�todo
 * 
 * Normalmente a classe s� possui um m�todo e nome igual ao
 * do m�todo que ir� substituir.
 * Visa classes mais concisas.
 *
 */
public class ISBN {

	private final String numero;

	public ISBN(String isbn) {
		if(!validar(isbn)) 
			throw new IllegalArgumentException(String.format("ISBN inválido: %s", isbn));
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
