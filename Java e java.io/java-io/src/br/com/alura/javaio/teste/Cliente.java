package br.com.alura.javaio.teste;

import java.io.Serializable;

// Para serializar objetos, � necess�rio que o mesmo implemente a interface Serializable
// Interface de marca��o
public class Cliente implements Serializable {
	
	// Id da classe, n�o faz parte do objeto
	// A vers�o s� deveria alterar com mudan�as incompat�veis
	// Administra a vers�o da classe
	// serialVersionUID � da classe (por isso est�tico) e define a vers�o ou 
	// identifica��o num�rica da classe. Cada vez que alteramos algo incompat�vel
	// na classe, devemos alterar o seu valor. Sempre quando serializamos o objeto, 
	// tamb�m ser� serializado o valor do serialVersionUID.
	private static final long serialVersionUID = -7326880247931089150L;
	
	private String nome;
	private String cpf;
	private String profissao;

	// Mudan�a na classe
	public String getNomeCpf() {
		return nome + ", " + cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
