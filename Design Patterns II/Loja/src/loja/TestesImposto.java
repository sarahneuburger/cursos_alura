package loja;

import java.math.BigDecimal;

import loja.impostos.CalculadoraDeImpostos;
import loja.impostos.ICMS;
import loja.impostos.ISS;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

public class TestesImposto {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		// Decorator
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
	}

}
