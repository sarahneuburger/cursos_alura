package leilao;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;

/**
 * Mock simula a instancia de uma classe.
 * Testes independentes de banco de dados e outras classes.
 * 
 */

public class HelloWorldMockito {
	
	@Test
	void hello() {
		// Atribuindo a instância do DAO como mock
		LeilaoDao mock = Mockito.mock(LeilaoDao.class);
		List<Leilao> todos = mock.buscarTodos();
		 // É sempre vazio o item criado no mock
		Assert.assertTrue(todos.isEmpty());
	}

}