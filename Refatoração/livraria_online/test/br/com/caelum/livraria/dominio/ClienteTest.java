package br.com.caelum.livraria.dominio;

import static br.com.caelum.livraria.dominio.ObjetosParaTestes.CEP;
import static br.com.caelum.livraria.dominio.ObjetosParaTestes.ID_CLIENTE;
import static br.com.caelum.livraria.dominio.ObjetosParaTestes.UM_CLIENTE;
import static br.com.caelum.livraria.dominio.ObjetosParaTestes.UM_DDD;
import static br.com.caelum.livraria.dominio.ObjetosParaTestes.UM_NUMERO;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ClienteTest {

	// CTRL + SHIFT + M faz o import static de algo
	@Test
	public void igualdade() {
		Cliente outroCliente = new Cliente(ID_CLIENTE, UM_DDD, UM_NUMERO, CEP);
		
		assertThat(UM_CLIENTE, is(equalTo(outroCliente)));
		assertThat(UM_CLIENTE.hashCode(), is(equalTo(outroCliente.hashCode())));
	}
	
	@Test
	public void lerTelefoneFormatado() {
		assertThat(UM_CLIENTE.getTelefone(), is(equalTo("(11) 55555555")));
	}
	
}
