package ed.listaligada;

public class TestaListaLigada {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adiciona("Sarah");
		System.out.println(lista);
		lista.adiciona("Henrique");
		System.out.println(lista);
		lista.adiciona("João");
		System.out.println(lista);
		lista.adiciona("Marta");
		
	}

}
