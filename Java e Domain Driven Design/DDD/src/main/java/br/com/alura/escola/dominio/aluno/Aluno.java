package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

//Aggregate root, possui uma cole��o de objetos relacionados
public class Aluno {
	
	private CPF cpf;
	private String nome;
	
	private Email email;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	private String senha;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		if(telefones.size() == 2) {
			// Invariante de neg�cio, business invariant. S�o as regras de neg�cio.
			// Devem ficar no objeto que fazem sentido
			throw new IllegalArgumentException("Permitido apenas dois telefones por cadastro");
		}
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public CPF getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email.getEndereco();
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public String getSenha() {
		return senha;
	}
	
}






