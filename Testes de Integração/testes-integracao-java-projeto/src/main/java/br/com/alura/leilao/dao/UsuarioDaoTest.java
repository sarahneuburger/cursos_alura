package br.com.alura.leilao.dao;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.model.Usuario;

public class UsuarioDaoTest {

	private UsuarioDao dao;
	private EntityManager em;
	
	@Test
	public void testeBuscarUsuarioPeloUsername() {
		this.dao = new UsuarioDao(em);
		Usuario usuario = this.dao.buscarPorUsername("fulano");
		Assert.assertNotNull(usuario);
	}

}
