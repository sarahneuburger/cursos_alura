package loja.impostos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class ISS implements TipoDeImposto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
