package pilha;

public class TesteConexao {
	
	public static void main(String[] args) throws Exception {
		
		// Simplifcação try/catch
		// A classe chamada precisa implementar a classe AutoCloseble
		// O trecho do try já traz automaticamente o finally, devido a interface criada.
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro de Conexão");
		}
		
		//----------------------------------------------
		
		Conexao con = null;
		
		// Por ser unchecked, não reclama no método.
		// Mas é colocado entre try/catch
		
		// O try pode ser acompanhado por CATCH ou/e FINALLY
		try {
			con = new Conexao();
			con.leDados();
		} catch (Exception e) {
			System.out.println("Erro de Conexão");
		} finally {
			// Será executado com ou sem exceção.
			// Serve para fechar o processo, idenpendente do que acontecer.
			// Faz parte do try/catch.
			// Máquina virtual força essa execução
			con.close(); // Erro ocorre no lê dados, mas ainda assim fecha a conexão
			
		}
		
		
	}

}
