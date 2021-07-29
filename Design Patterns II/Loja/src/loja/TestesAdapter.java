package loja;

import java.math.BigDecimal;

import loja.http.JavaHttpClient;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroOrcamento;
/**
 * Adapter
 * 
 * Classe precisa precisar conversar com uma classe, possui várias formas.
 * Cria espécie meio de campo para interagir entre elas.
* Não é necessário alterar o adpter sempre quenhá mudanças.
* Realizar mudanças sem impactar nesta classe.
 *
 *
 */
public class TestesAdapter {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
