package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// O padrão para referências é null
		ContaCorrente[] contas = new ContaCorrente[5];

		ContaCorrente cc1 = new ContaCorrente(123, 456);
		ContaCorrente cc2 = new ContaCorrente(789, 321);
		
		// Quando atribuído um objeto para o array, o que ele armazena é a referências, não
		// o objeto em si.
		contas[0] = cc1;
		contas[1] = cc2;
		
		// São três objetos de conta corrente criados, mas apenas duas referências		
		ContaCorrente ref = contas[2];
		System.out.println(ref.getNumero());
		System.out.println(cc2.getNumero());;
	}

}
