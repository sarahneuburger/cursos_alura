package pilha;

public class ExceptionUnchecked extends RuntimeException {
	// Exce��o unchecked, estende diretamente da classe RuntimeException.
	// N�o � verificada pelo compilador.
	public ExceptionUnchecked(String msg) {
		super(msg);
	}

}
