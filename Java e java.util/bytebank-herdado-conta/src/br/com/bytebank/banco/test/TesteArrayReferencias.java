package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// O padr�o para refer�ncias � null
		ContaCorrente[] contas = new ContaCorrente[5];

		ContaCorrente cc1 = new ContaCorrente(123, 456);
		ContaCorrente cc2 = new ContaCorrente(789, 321);
		
		// Quando atribu�do um objeto para o array, o que ele armazena � a refer�ncias, n�o
		// o objeto em si.
		contas[0] = cc1;
		contas[1] = cc2;
		
		// S�o tr�s objetos de conta corrente criados, mas apenas duas refer�ncias		
		ContaCorrente ref = contas[2];
		System.out.println(ref.getNumero());
		System.out.println(cc2.getNumero());;
	}

}
