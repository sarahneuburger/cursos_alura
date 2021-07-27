package loja;

import java.math.BigDecimal;

import loja.http.JavaHttpClient;
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
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
