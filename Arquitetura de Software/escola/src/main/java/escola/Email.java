package escola;

public class Email {

	
	/**
	 * VALUE OBJECT - não tem diferenciação se o objeto é único ou não.
	 *
	 * Se os objetos tiverem esse mesmo atributo com o mesmo valor é considerado 
	 * como sendo o mesmo objeto, a mesma instância. No caso, se dois e-mails têm 
	 * o mesmo endereço, eu estou falando do mesmo e-mail.
	 */
	private String endereco;

	public Email(String endereco) {
		if(endereco == null || !endereco.matches("/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/")) {
			throw new IllegalArgumentException("E-mail inválido");
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
