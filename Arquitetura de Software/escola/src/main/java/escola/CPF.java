package escola;

public class CPF {

	
	/**
	 * VALUE OBJECT - n�o tem diferencia��o se o objeto � �nico ou n�o.
	 *
	 * Se os objetos tiverem esse mesmo atributo com o mesmo valor � considerado 
	 * como sendo o mesmo objeto, a mesma inst�ncia. No caso, se dois e-mails t�m 
	 * o mesmo endere�o, eu estou falando do mesmo e-mail.
	 */
	private String numero;

	public CPF(String numero) {
		if(numero == null || !numero.matches("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})")) {
			throw new IllegalArgumentException("CPF inv�lido");
		}
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
