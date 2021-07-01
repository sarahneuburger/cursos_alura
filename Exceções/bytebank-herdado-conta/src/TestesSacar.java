public class TestesSacar {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.00);
		
		// N�o vai alterar o saldo da conta e trata a exce��o.
		try {
			conta.saca(210.00);
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		// Ir� apresentar nossa exce��o pois n�o h� saldo par saque.
		System.out.println(conta.getSaldo());
		
	}

}
