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
 * Classe Throwable é extendida pela Exception, graças à ela é possível jogar
 * as exceções na pilha de excecução.
 * 
 * Ordem da exceptions: NullPointerException - extends Runtime Exception - 
 * extends Exception - extends Trowable.
 * 
 * Checked - Estende diretamente da classe Exception - Verificados pelo compilador.
 * É necessário explicitar já na assinatura do método o throws da exceção ou
 * tratar a partir de try/catch.
 * Unchecked - Estende da classe RuntimeException - Não são verificados pelo 
 * compilador.
 *
 */

public class FluxoTratandoExceções {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		// Multi catch, quanto quiser, desde que específicos
		try {
			metodo1();
			
			// Só é executado em caso dessa exceção específica
			// Usar pipe para "ou" colocar várias exceções no mesmo catch
			// O tipo da exceção é baseado em uma classe
		} catch (ArithmeticException | NullPointerException | ExceptionUnchecked | ExceptionChecked e) {
			System.out.println("ArithmeticException " + e.getMessage());
			// Printa o rastro da pilha
			e.printStackTrace();
			System.out.println("Fim do main");
		}
	}

	// Exceção checked, é necessário throws na assinatura do método ou try/catch
	private static void metodo1() throws ExceptionChecked {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
		throw new ExceptionChecked("Erro de execução");
	}

	// Exceção unchecked, não é necessário throws na assinatura do método ou try/catch
	private static void metodo2() {
	    System.out.println("Ini do metodo2");
	    
	    // É possível passar uma string de parâmetro para o construtor da exceção
	    // Throw "joga" a exceção na pilha de execução
	    throw new ExceptionUnchecked("Erro de execução");
	    //System.out.println("Fim do metodo2");
	    
	}

}
