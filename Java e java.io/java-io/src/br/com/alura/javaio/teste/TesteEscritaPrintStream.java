package br.com.alura.javaio.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo
		// OutputStream fos = new FileOutputStream("lorem.txt"); // Usada para escrever
		// bytes num arquivo.
		// Writer osw = new OutputStreamWriter(fos);
		// BufferedWriter bw = new BufferedWriter(osw);

		// PrintWriter ps = new PrintWriter("lorem2.txt");
		PrintStream ps = new PrintStream("lorem2.txt");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
		ps.println();
		ps.println("consequat. Duis aute irure dolor in reprehenderit in voluptate velit");
		ps.close();

	}

}
