package loja.impostos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public interface TipoDeImposto {
	
	public BigDecimal calcular(Orcamento orcamento);

}
