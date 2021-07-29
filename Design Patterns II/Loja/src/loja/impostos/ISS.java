package loja.impostos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class ISS extends TipoDeImposto {
	
	public ISS(TipoDeImposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
