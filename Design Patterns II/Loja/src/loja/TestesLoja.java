package loja;

import java.math.BigDecimal;

import loja.impostos.CalculadoraDeImpostos;
import loja.impostos.ICMS;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

public class TestesLoja {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		BigDecimal retorno = calculadoraDeImpostos.calcular(orcamento, new ICMS(null));
		System.out.println(retorno);
		
	}

}
