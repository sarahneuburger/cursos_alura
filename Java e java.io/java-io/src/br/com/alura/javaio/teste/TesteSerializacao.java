package br.com.alura.javaio.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, Exception {

		// Para serializar é preciso um objeto
		String nome = "Sarah";

		// Fluxo de bites e bytes
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream("objeto.bin"));

		// Vai gerar o objeto "nome" em um arquivo binário
		// oos.writeObject(nome);
		// oos.close();

		// Fluxo contrário, transformar binário em objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String retorno = (String) ois.readObject();
		ois.close();

		System.out.println(retorno);

	}

}
