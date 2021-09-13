package br.com.bytebank.banco.test;

//Array
public class TesteArrayPrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[5]; // Inicializa com 0

		idades[0] = 29; // Atribuir valores em determinada posição
		idades[1] = 30;
		idades[2] = 31;
		idades[3] = 32;
		idades[4] = 33;

		System.out.println(idades.length); // tamanho

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

		// Forma literal de declaração
		int[] refs = {1,2,3,4,5};
	}

}
