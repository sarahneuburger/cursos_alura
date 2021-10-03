package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

public class Selo {

	private CPF cpfDoALuno;
	private String nomeString;

	public Selo(CPF cpfDoALuno, String nomeString) {
		this.cpfDoALuno = cpfDoALuno;
		this.nomeString = nomeString;
	}

	public CPF getCpfDoALuno() {
		return cpfDoALuno;
	}

	public String getNomeString() {
		return nomeString;
	}

}
