package ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	private List<String> nomes = new LinkedList<String>();

	// Insere sempre um atr�s do outro
	public void push(String nome) {
		nomes.add(nome);
	}

	// Sempre o �ltimo da pilha
	public String pop() {
		return nomes.remove(nomes.size() - 1);
	}

	public boolean vazia() {
		return nomes.isEmpty();
	}

	@Override
	public String toString() {
		return nomes.toString();
	}

}
