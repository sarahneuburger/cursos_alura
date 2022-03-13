package ed.fila;

import java.util.LinkedList;
import java.util.List;

// Primeiro elemento a entrar � o primeiro a sair
public class Fila {
	
	private List<String> alunos = new LinkedList<String>();
	
	public void adiciona(String elemento) {
		alunos.add(elemento);
	}
	
	public String remove() {
		return alunos.remove(0); // Primeiro elemento. Na fila � sempre removido o primeiro elemento.
	}
	
	public boolean vazia() {
		return alunos.isEmpty();
	}
	
	@Override
	public String toString() {
		return alunos.toString();
	}
		

}
