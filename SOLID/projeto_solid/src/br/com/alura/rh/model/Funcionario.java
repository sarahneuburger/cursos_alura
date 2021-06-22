package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Princ�pio da Responsabilidade �nica
 * Uma classe deveria ter apenas um �nico motivo para mudar.
 * Foca em coes�o.
 * A valida��o do sal�rio fica na classe ReajusteService, para que n�o haja
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

	// Este m�todo � delicado, pois pode ser utilizado para quebrar o encapusalamento
	// Pensar em algo para que seja poss�vel utilizar somente em conjunto com a classe 
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
