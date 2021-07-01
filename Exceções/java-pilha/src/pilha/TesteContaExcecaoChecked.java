package pilha;

public class TesteContaExcecaoChecked {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		// Basta ter a exceção do tipo checked na assinatura 
		// que o compilador aguarda o throw ou try/catch
		try {
			c.depositar();
		} catch (ExceptionChecked e) {
			System.out.println("Tratamento");
			e.printStackTrace();
		}
	}

}
