package loja.impostos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class ICMS extends TipoDeImposto {
	
	public ICMS(TipoDeImposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.6"));
	}

}
