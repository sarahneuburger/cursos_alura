package br.com.alura.javaio.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// V1
		// Fluxo de entrada com arquivo
		// OutputStream fos = new FileOutputStream("lorem.txt"); // Usada para escrever
		// bytes num arquivo.
		// Writer osw = new OutputStreamWriter(fos);
		// BufferedWriter bw = new BufferedWriter(osw);

		// V2
		// FileWriter fw = new FileWriter("lorem2.txt");
		// fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
		// eiusmod ");
		// fw.write(System.lineSeparator()); // Quebra de linha neste caso
		// fw.write("consequat. Duis aute irure dolor in reprehenderit in voluptate
		// velit");
		// fw.close();

		// V3
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine(); // Quebra de linha neste caso
		bw.newLine();
		bw.close();

	}

}
