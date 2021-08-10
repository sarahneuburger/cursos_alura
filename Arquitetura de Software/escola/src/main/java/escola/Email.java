package escola;

public class Email {

	
	/**
	 * VALUE OBJECT - n�o tem diferencia��o se o objeto � �nico ou n�o.
	 *
	 * Se os objetos tiverem esse mesmo atributo com o mesmo valor � considerado 
	 * como sendo o mesmo objeto, a mesma inst�ncia. No caso, se dois e-mails t�m 
	 * o mesmo endere�o, eu estou falando do mesmo e-mail.
	 */
	private String endereco;

	public Email(String endereco) {
		if(endereco == null || !endereco.matches("/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/")) {
			throw new IllegalArgumentException("E-mail inv�lido");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
	
	
}
