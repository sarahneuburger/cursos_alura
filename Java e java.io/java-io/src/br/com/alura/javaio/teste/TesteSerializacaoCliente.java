package br.com.alura.javaio.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws Exception {

		Cliente cliente = new Cliente();
		cliente.setNome("Sarah");
		cliente.setProfissao("Dev");
		cliente.setCpf("12365498700");

		// Transformar objeto em binário
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream("cliente.bin"));
		// oos.writeObject(cliente);
		// oos.close();

		// Fluxo contrário, transformar binário em objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente retorno = (Cliente) ois.readObject();
		ois.close();
		System.out.println(retorno.getNome());
	}

}
