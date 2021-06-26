package pilha;

/**
 * Exemplo para visualizar o erros capturados pela m�quina virtual.
 * As classes de erros tamb�m estendem a Thrownable.
 *
 */

public class FluxoComErro {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		// Multi catch, quanto quiser, desde que espec�ficos
		try {
			metodo1();
			
			// S� � executado em caso dessa exce��o espec�fica
			// Usar pipe para "ou" colocar v�rias exce��es no mesmo catch
			// O tipo da exce��o � baseado em uma classe
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

	// Fica em looping, um m�todo chamando o outro
	// Estoura o tamanho da pilha
	// Erro StackOverflowError
	private static void metodo2() {
	    System.out.println("Ini do metodo2");
	    metodo2();
	    System.out.println("Fim do metodo2");
	    
	}

}
