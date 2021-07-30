package loja.orcamento;

import java.math.BigDecimal;
/**
 * Proxy
 * 
 * Armazena dados em cach� para evitar a demora na execu��o.
 * O getValor possui lentid�o para execu��o, o proxy
 * armazena esse dado. Caso j� exista valor, est� dispon�vel 
 * instantaneamente.
 *
 * Cria uma camada que intercepta a chamada para o objeto original
 * para fazer tratamento, valida��es, otimiza��es. Armazena
 * essa informa��o.
 */
public class OrcamentoProxy implements Orcavel {
	
	private BigDecimal valor;
	private Orcamento orcamento;
	
	public OrcamentoProxy(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	@Override
	public BigDecimal getValor() {
		if (valor == null) {
			this.valor = orcamento.getValor();
		}
		
		return this.valor;
	
	}
	
	
	

}
