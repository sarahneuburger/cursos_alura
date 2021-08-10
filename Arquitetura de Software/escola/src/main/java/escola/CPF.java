package escola;

public class CPF {

	
	/**
	 * VALUE OBJECT - não tem diferenciação se o objeto é único ou não.
	 *
	 * Se os objetos tiverem esse mesmo atributo com o mesmo valor é considerado 
	 * como sendo o mesmo objeto, a mesma instância. No caso, se dois e-mails têm 
	 * o mesmo endereço, eu estou falando do mesmo e-mail.
	 */
	private String numero;

	public CPF(String numero) {
		if(numero == null || !numero.matches("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})")) {
			throw new IllegalArgumentException("CPF inválido");
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
