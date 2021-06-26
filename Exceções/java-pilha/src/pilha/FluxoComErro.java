package pilha;

/**
 * Exemplo para visualizar o erros capturados pela máquina virtual.
 * As classes de erros também estendem a Thrownable.
 *
 */

public class FluxoComErro {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		// Multi catch, quanto quiser, desde que específicos
		try {
			metodo1();
			
			// Só é executado em caso dessa exceção específica
			// Usar pipe para "ou" colocar várias exceções no mesmo catch
			// O tipo da exceção é baseado em uma classe
		} catch (ArithmeticException | NullPointerException | ExceptionUnchecked e) {
			System.out.println("ArithmeticException " + e.getMessage());
			// Printa o rastro da pilha
			e.printStackTrace();
			System.out.println("Fim do main");
		}
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	// Fica em looping, um método chamando o outro
	// Estoura o tamanho da pilha
	// Erro StackOverflowError
	private static void metodo2() {
	    System.out.println("Ini do metodo2");
	    metodo2();
	    System.out.println("Fim do metodo2");
	    
	}

}
