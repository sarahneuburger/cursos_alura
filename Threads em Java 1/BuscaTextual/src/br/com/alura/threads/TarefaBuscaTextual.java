package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

	private String nomeDoArquivo;
	private String nomeProcurado;

	public TarefaBuscaTextual(String nomeDoArquivo, String nomeProcurado) {
		this.nomeDoArquivo = nomeDoArquivo;
		this.nomeProcurado = nomeProcurado;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeDoArquivo));
			int numeroLinha = 1;
			
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if(linha.contains(nomeProcurado)) {
					System.out.println(nomeDoArquivo + " - " + numeroLinha + " - " + linha);
				}
				
				numeroLinha++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
