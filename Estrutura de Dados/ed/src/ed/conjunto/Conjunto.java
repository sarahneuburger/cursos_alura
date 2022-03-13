package ed.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	// É como se cada conjunto fosse um letra do alfabeto para organizar as palavras
	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<>());
		}
	}

	public void adiciona(String palavra) {
		if(!contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(indice); // O get de um LinkedList é caro, então, foi trocado para ArrayList 
			lista.add(palavra);
		}
	}
	
	public void remove(String palavra) {
		if (contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(indice);
			lista.remove(palavra);
		}
	}

	private boolean contem(String palavra) {
		int indice = calculaIndiceDaTabela(palavra); // Busca a lista certa
		return tabela.get(indice).contains(palavra); // Verifica se já tem o elemento
	}

	// Função de "espalhamento"
	private int calculaIndiceDaTabela(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26; // Tem que devolver sempre o mesmo valor para o mesmo objeto
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}
}
