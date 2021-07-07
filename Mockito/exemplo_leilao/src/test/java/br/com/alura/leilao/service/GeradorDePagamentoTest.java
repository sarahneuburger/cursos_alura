package br.com.alura.leilao.service;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.alura.leilao.dao.PagamentoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Pagamento;
import br.com.alura.leilao.model.Usuario;

class GeradorDePagamentoTest {

	private GeradorDePagamento service;

	@Mock
	private PagamentoDao dao;
	
	@Mock
	private Clock clock;
	
	// Capturar objeto criado pra utilizar nos testes
	@Captor
	private ArgumentCaptor<Pagamento> captor;

	@BeforeEach
	public void beforeEach() {
		// Ler anotações do mockito
		MockitoAnnotations.initMocks(this);

		this.service = new GeradorDePagamento(dao, clock);
	}

	// Clock pode ser utilizado para realizar os testes simulando um período do relógio
	
	@Test
	void deveriaCriarPagamentoParaVencedorDoLeiao() {
		Leilao leilao = leilao();
		Lance vencedor = leilao.getLanceVencedor();
		
		LocalDate data = LocalDate.of(2020, 12, 7);
		
		Instant instant = data.atStartOfDay(ZoneId.systemDefault());
		
		Mockito.when(clock.instant()).thenReturn(instant);
		Mockito.when(clock.getZone()).thenReturn(ZoneId.systemDefault());
		
		service.gerarPagamento(vencedor);
		
		// Capturando o objeto que foi criado no salvar
		Mockito.verify(dao).salvar(captor.capture());
		// Utilizando o objeto capturado
		Pagamento pagamento = captor.getValue();
		
		org.junit.Assert.assertEquals(LocalDate.now().plusDays(1), pagamento.getVencimento());
		org.junit.Assert.assertEquals(vencedor.getValor(), pagamento.getValor());
		org.junit.Assert.assertFalse(pagamento.getPago());
		org.junit.Assert.assertEquals(vencedor.getUsuario(), pagamento.getUsuario());
		org.junit.Assert.assertEquals(leilao, pagamento.getLeilao());
		
	}

	// Alimentado o mock
	private Leilao leilao() {
		Leilao leilao = new Leilao("Celular", new BigDecimal("400"), new Usuario("Fulano"));
		Lance segundo = new Lance(new Usuario("Ciclano"), new BigDecimal("900"));
		leilao.propoe(segundo);
		leilao.setLanceVencedor(segundo);
		return leilao;

	}

}
