package br.com.caelum.livraria.dominio;

/**
 * Substituir m�todo por objeto m�todo
 * 
 * Classe recebe todos os atributos necess�rios para o m�todo que ir� 
 * representar.
 */
public class Validar {
	
	private String valor;
	
	public Validar(String valor) {
		super();
		this.valor = valor;
	}

	public boolean validar() {
		if (valor == null) return false;

		String valorSomenteNumerosString = valor.replaceAll("-", "");
		if(valorSomenteNumerosString.length() != 13) return false;
		
		try{
			int tot = 0;
			for (int i = 0; i < 12; i++ ){
				int digito = Integer.parseInt(valorSomenteNumerosString.substring(i, i + 1));
				tot += (i % 2 == 0) ? digito * 1 : digito * 3;
			}

			int checksum = 10 - (tot % 10);
			if (checksum == 10) checksum = 0;

			return checksum == Integer.parseInt(valorSomenteNumerosString.substring(12));
		}
		catch (NumberFormatException nfe){
			return false;
		}
	}
}
