package br.com.bytebank.banco.test;

public class TesteArrayString {

	// "args" consegue interagir com o programa via a linha de comando, s�o os par�metros passados
	// Tamb�m � poss�vel passar esses par�metros nas configura��es do run, na IDE (arguments - program arguments)
	public static void main(String[] args) {
		
		// Se preenchermos esses argumentos, � poss�vel imprim�-los
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);;
			
		}
	}

}
