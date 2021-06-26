package pilha;

public class ExceptionChecked extends Exception{
	
	// Exceção checked, estende diretamente da classe Exception.
	// É verificada pelo compilador.
	public ExceptionChecked(String msg) {
		super(msg);
	}

}
