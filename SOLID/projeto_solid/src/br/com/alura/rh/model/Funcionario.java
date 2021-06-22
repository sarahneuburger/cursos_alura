package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Princípio da Responsabilidade Única
 * Uma classe deveria ter apenas um único motivo para mudar.
 * Foca em coesão.
 * A validação do salário fica na classe ReajusteService, para que não haja
 * mais de uma responsabilidade.
*/
public class Funcionario {

	private DadosPessoais dadosPessoais;

	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste) {
		super();
		this.dadosPessoais = dadosPessoais;
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	// Este método é delicado, pois pode ser utilizado para quebrar o encapusalamento
	// Pensar em algo para que seja possível utilizar somente em conjunto com a classe 
	// ReajusteService
	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.cargo = novoCargo;
		
	}

}
