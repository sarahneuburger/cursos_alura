package pilha;

public class ExceptionUnchecked extends RuntimeException {
	// Exceção unchecked, estende diretamente da classe RuntimeException.
	// Não é verificada pelo compilador.
	public ExceptionUnchecked(String msg) {
		super(msg);
	}

}
