package pilha;

/**
 * Pilha
 * 
 * Organiza a execu��o do c�digo, come�ando no main. O que est� no topo da
 * pilha, � o que est� sendo executado. Remove da pilha o que j� foi executado,
 * at� que esteja vazia (fim do main), ent�o, o programa � encerrado.
 * 
 * Depura��o
 * 
 * Ponto que aparece onde queremos que inicie o debug, se chama ponto de
 * depura��o. Permite observar em tempo real a pilha.
 * 
 * Exe��es As exce��es s�o problemas que acontecem na hora de compilar o c�digo.
 * Considerando que existe uma variedade imensa, elas possuem nomes explicativos
 * e, �s vezes, mostram claramente o motivo de seu surgimento, facilitando a
 * identifica��o delas.
 *
 * Quando a exce��o acontece, cai na pilha de execu��o e fica jogando sempre
 * para o pr�ximo da pilha para tentar resolver. Quando nenhum consegue, acaba a
 * pilha e a aplica��o.
 *
 */

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		// Multi catch, quanto quiser, desde que espec�ficos
		try {
			metodo1();
			
			// S� � executado em caso dessa exce��o espec�fica
			// Usar pipe para "ou" colocar v�rias exce��es no mesmo catch
			// Como todas as exce��es herdam de Exception, o catch chamado somente ela
			// � suficiente para capturar todo tipo de exce��o, "gen�rico"
		} catch (Exception e) {
			System.out.println("ArithmeticException " + e.getMessage());
			// Printa o rastro da pilha
			e.printStackTrace();
			System.out.println("Fim do main");
		}
	}

	private static void metodo1() throws ExceptionChecked {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws ExceptionChecked {
	    System.out.println("Ini do metodo2");
	    for(int i = 1; i <= 5; i++) {
	    	System.out.println(i);
	        // Divis�o por zero
	        int a = i / 0;
	            	
	        // NullPointer
			Conta c = null;
			c.depositar();
					
	        System.out.println("Fim do metodo2");
	    }
	    
	}

}
