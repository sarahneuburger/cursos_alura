package pilha;

public class Conexao implements AutoCloseable{
	
	public Conexao() {
		System.out.println("Abrindo a conexão.");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados.");
		throw new IllegalStateException(); // Erro de estado
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Fechar conexão.");
		
	}

}
