package br.com.bytebank.banco.test;

public class TesteArrayString {

	// "args" consegue interagir com o programa via a linha de comando, são os parâmetros passados
	// Também é possível passar esses parâmetros nas configurações do run, na IDE (arguments - program arguments)
	public static void main(String[] args) {
		
		// Se preenchermos esses argumentos, é possível imprimí-los
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);;
			
		}
	}

}
