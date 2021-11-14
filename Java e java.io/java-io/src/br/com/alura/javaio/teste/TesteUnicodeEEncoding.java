package br.com.alura.javaio.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "C";
		// Retorna a posição na tabela Unicode
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		// Imprime o charset de acordo com o sistema operacional
		System.out.println(charset.displayName());
		
		// Pode forçar o charset que quer utilizar no construtor
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNova = new String(bytes, "windows-1252");
		System.out.println(sNova);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNova = new String(bytes, "windows-1252"); // Dá errado quando tenta converter bytes do UTF-16 para windows-1252
		System.out.println(sNova);
		
		// Utilizando a classe que possui algumas constantes de tabelas
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII, ");
		sNova = new String(bytes, "windows-1252");
		System.out.println(sNova);

	}

}
