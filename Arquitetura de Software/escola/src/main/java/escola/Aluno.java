package escola;

import java.util.ArrayList;
import java.util.List;

/**
 * ID faz parte da infraestrutura (banco) e n�o ao dom�nio.
 * 
 * Nesse contexto, entidade � a classe que possui o identificador �nico
 * de um objeto.
 */
public class Aluno {
	
	// Servi�o como identificado �nico
	private CPF cpf;
	private String nome;
	private Email email;
	
	private List<Telefone> telefones = new ArrayList<>();

	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	public CPF getCpf() {
		return cpf;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
	
}
