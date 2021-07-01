package pilha;

/**
 * Pilha
 * 
 * Organiza a execução do código, começando no main. O que está no topo da
 * pilha, é o que está sendo executado. Remove da pilha o que já foi executado,
 * até que esteja vazia (fim do main), então, o programa é encerrado.
 * 
 * Depuração
 * 
 * Ponto que aparece onde queremos que inicie o debug, se chama ponto de
 * depuração. Permite observar em tempo real a pilha.
 * 
 * Exeções As exceções são problemas que acontecem na hora de compilar o código.
 * Considerando que existe uma variedade imensa, elas possuem nomes explicativos
 * e, às vezes, mostram claramente o motivo de seu surgimento, facilitando a
 * identificação delas.
 *
 * Quando a exceção acontece, cai na pilha de execução e fica jogando sempre
 * para o próximo da pilha para tentar resolver. Quando nenhum consegue, acaba a
 * pilha e a aplicação.
 *
 */

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		// Multi catch, quanto quiser, desde que específicos
		try {
			metodo1();
			
			// Só é executado em caso dessa exceção específica
			// Usar pipe para "ou" colocar várias exceções no mesmo catch
			// Como todas as exceções herdam de Exception, o catch chamado somente ela
			// é suficiente para capturar todo tipo de exceção, "genérico"
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
	        // Divisão por zero
	        int a = i / 0;
	            	
	        // NullPointer
			Conta c = null;
			c.depositar();
					
	        System.out.println("Fim do metodo2");
	    }
	    
	}

}
