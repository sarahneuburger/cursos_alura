package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TestaFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adiciona("Sarah");
		fila.adiciona("Maria");
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
		System.out.println(fila.vazia());
		
		// Interface do Java
		Queue<String> filaDoJava = new LinkedList<>(); // A LinkedList implementa Queue
		filaDoJava.add("Carla");
		System.out.println(filaDoJava);
		
	}
	


}
