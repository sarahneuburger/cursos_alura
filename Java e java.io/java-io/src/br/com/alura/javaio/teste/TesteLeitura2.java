package br.com.alura.javaio.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
	
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			// Separador entre Strings
			//String[] valores = linha.split(",");
			//System.out.println(valores);
			
			// Com Scanner novo para analisar cada linha
			Scanner linhaScanner = new Scanner(linha);
			// Utilizar regras por local, exemplo ponto no Double
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			// Formatação de String, % é a posição do item na Strinf e o segundo parâmetro pode seguir
			// várias regras, conforme doc, nesse caso, condiz com o tipo do dado concatenado.
			// Na agência 04 significa que o valor inicia com 0 e tem 4 de tamanho.
			// No saldo 010.2, inicia com zero, tem tamanho total de 10 e 2 casas após a vírgula.
			// %n quebra de linha.
			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d %20s %010.2f %n", tipoConta, agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
			
			linhaScanner.close();
		}
		
		scanner.close();
	}
}
