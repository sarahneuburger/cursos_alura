package pilha;

public class TesteConexao {
	
	public static void main(String[] args) throws Exception {
		
		// Simplifca��o try/catch
		// A classe chamada precisa implementar a classe AutoCloseble
		// O trecho do try j� traz automaticamente o finally, devido a interface criada.
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro de Conex�o");
		}
		
		//----------------------------------------------
		
		Conexao con = null;
		
		// Por ser unchecked, n�o reclama no m�todo.
		// Mas � colocado entre try/catch
		
		// O try pode ser acompanhado por CATCH ou/e FINALLY
		try {
			con = new Conexao();
			con.leDados();
		} catch (Exception e) {
			System.out.println("Erro de Conex�o");
		} finally {
			// Ser� executado com ou sem exce��o.
			// Serve para fechar o processo, idenpendente do que acontecer.
			// Faz parte do try/catch.
			// M�quina virtual for�a essa execu��o
			con.close(); // Erro ocorre no l� dados, mas ainda assim fecha a conex�o
			
		}
		
		
	}

}
