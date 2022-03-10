package ed.listaligada;

public class TestaListaLigada {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Sarah");
		System.out.println(lista);
		lista.adicionaNoComeco("Henrique");
		System.out.println(lista);
		lista.adicionaNoComeco("Jo�o");
		System.out.println(lista);
		lista.adicionaNoComeco("Marta");
		System.out.println(lista);
		
		lista.adiciona("Carlos");
		System.out.println(lista);
		
		lista.adiciona(2, "Mariana");
		System.out.println(lista);
		
		Object retorno = lista.pega(2);
		System.out.println(retorno);
		
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
	}

}
