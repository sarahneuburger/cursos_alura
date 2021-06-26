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
 * Classe Throwable � extendida pela Exception, gra�as � ela � poss�vel jogar
 * as exce��es na pilha de excecu��o.
 * 
 * Ordem da exceptions: NullPointerException - extends Runtime Exception - 
 * extends Exception - extends Trowable.
 * 
 * Checked - Estende diretamente da classe Exception - Verificados pelo compilador.
 * � necess�rio explicitar j� na assinatura do m�todo o throws da exce��o ou
 * tratar a partir de try/catch.
 * Unchecked - Estende da classe RuntimeException - N�o s�o verificados pelo 
 * compilador.
 *
 */

public class FluxoTratandoExce��es {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		// Multi catch, quanto quiser, desde que espec�ficos
		try {
			metodo1();
			
			// S� � executado em caso dessa exce��o espec�fica
			// Usar pipe para "ou" colocar v�rias exce��es no mesmo catch
			// O tipo da exce��o � baseado em uma classe
		} catch (ArithmeticException | NullPointerException | ExceptionUnchecked | ExceptionChecked e) {
			System.out.println("ArithmeticException " + e.getMessage());
			// Printa o rastro da pilha
			e.printStackTrace();
			System.out.println("Fim do main");
		}
	}

	// Exce��o checked, � necess�rio throws na assinatura do m�todo ou try/catch
	private static void metodo1() throws ExceptionChecked {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
		throw new ExceptionChecked("Erro de execu��o");
	}

	// Exce��o unchecked, n�o � necess�rio throws na assinatura do m�todo ou try/catch
	private static void metodo2() {
	    System.out.println("Ini do metodo2");
	    
	    // � poss�vel passar uma string de par�metro para o construtor da exce��o
	    // Throw "joga" a exce��o na pilha de execu��o
	    throw new ExceptionUnchecked("Erro de execu��o");
	    //System.out.println("Fim do metodo2");
	    
	}

}
