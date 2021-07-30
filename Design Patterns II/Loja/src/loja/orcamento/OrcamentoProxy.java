package loja.orcamento;

import java.math.BigDecimal;
/**
 * Proxy
 * 
 * Armazena dados em cachê para evitar a demora na execução.
 * O getValor possui lentidão para execução, o proxy
 * armazena esse dado. Caso já exista valor, está disponível 
 * instantaneamente.
 *
 * Cria uma camada que intercepta a chamada para o objeto original
 * para fazer tratamento, validações, otimizações. Armazena
 * essa informação.
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
