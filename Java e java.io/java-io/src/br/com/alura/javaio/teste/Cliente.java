package br.com.alura.javaio.teste;

import java.io.Serializable;

// Para serializar objetos, é necessário que o mesmo implemente a interface Serializable
// Interface de marcação
public class Cliente implements Serializable {
	
	// Id da classe, não faz parte do objeto
	// A versão só deveria alterar com mudanças incompatíveis
	// Administra a versão da classe
	// serialVersionUID é da classe (por isso estático) e define a versão ou 
	// identificação numérica da classe. Cada vez que alteramos algo incompatível
	// na classe, devemos alterar o seu valor. Sempre quando serializamos o objeto, 
	// também será serializado o valor do serialVersionUID.
	private static final long serialVersionUID = -7326880247931089150L;
	
	private String nome;
	private String cpf;
	private String profissao;

	// Mudança na classe
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
