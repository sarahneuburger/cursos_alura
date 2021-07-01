public class TestesSacar {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.00);
		
		// Não vai alterar o saldo da conta e trata a exceção.
		try {
			conta.saca(210.00);
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		// Irá apresentar nossa exceção pois não há saldo par saque.
		System.out.println(conta.getSaldo());
		
	}

}
