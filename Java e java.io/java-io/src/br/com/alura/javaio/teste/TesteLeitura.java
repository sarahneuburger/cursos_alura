package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // Passar charset no construtor
		// Classe para ler os caracteres
		BufferedReader br = new BufferedReader(isr);
		
		// Ler uma linha
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		// Assim como abrir, é preciso fechar a chamada
		br.close();

	}

}
