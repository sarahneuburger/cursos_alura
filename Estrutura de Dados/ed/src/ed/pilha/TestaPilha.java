package ed.pilha;

import java.util.Stack;

public class TestaPilha {

	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push("Sarah");
		System.out.println(pilha);
		
		pilha.push("Henrique");
		System.out.println(pilha);
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha.vazia());
		
		pilha.push("Maria");
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		// Pilha do java
		Stack<String> stack = new Stack<String>();
		stack.push("Nome 1"); // Insere
		stack.push("Nome 2");
		System.out.println(stack);
		
		System.out.println(stack.pop()); // Retira
		System.out.println(stack);
		
		// Pega o último elemento, mas não remove da pilha
		String nome = stack.peek(); // Só informa
		System.out.println(nome);
		
		System.out.println(stack);
	}
}
