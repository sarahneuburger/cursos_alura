package loja;

import java.math.BigDecimal;

import loja.descontos.CalculadoraDeDescontos;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

public class TestesDescontos {
	
	public static void main(String[] args) {
		
		
		Orcamento orcamento1 = new Orcamento();
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		Orcamento orcamento2 = new Orcamento();
		orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeDescontos calculadoraDescontos = new CalculadoraDeDescontos();
		BigDecimal retorno = calculadoraDescontos.calcular(orcamento1);
		BigDecimal retorno2 = calculadoraDescontos.calcular(orcamento2);
		System.out.println(retorno);
		System.out.println(retorno2);
		
	}

}
