package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// java.io fornece classes abstratas genéricas tanto para leitura 
		// (InputStream e Reader) quanto para escrita (OutputStream e Writer). 
		// Com as classes abstratas não precisamos saber qual a implementação 
		// usada na execução do código.
		
		
		Socket socket = new Socket();
		
		// Fluxo de entrada com arquivo
		// Input com o console
		// InputStream fis = System.in; // new FileInputStream("lorem.txt")
		InputStream fis = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		// Classe para ler os caracteres
		BufferedReader br = new BufferedReader(isr);
		
		// Fluxo de entrada com arquivo
		// OutputStream fos = System.out; // new FileOutputStream("lorem2.txt"); // Usada para escrever bytes num arquivo.
		OutputStream fos = socket.getOutputStream();
		Writer osw = new OutputStreamWriter(fos);
		// Claase para escrever
		BufferedWriter bw = new BufferedWriter(osw);
		
		// Ler uma linha
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		// Assim como abrir, é preciso fechar a chamada
		br.close();
		bw.close();
		socket.close();

	}

}
