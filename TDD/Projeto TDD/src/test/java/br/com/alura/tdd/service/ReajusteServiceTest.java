package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	// Boas práticas de testes:
	// Evitar código duplicados, variáveis repetidas inicializadas fora do método.
	// Implementar before para atribuir valor as variáveis.
	
	private ReajusteService service;
	private Funcionario func;
	
	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.func = new Funcionario("Sarah", LocalDate.now(), new BigDecimal("1000.00"));
	}

	// Implementar os testes antes dos métodos
	// Rascunho antes dos métodos
	// Ajuda a entender como implementar os métodos
	@Test
	public void reajusteDeveriaSerDe3PorCentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), func.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDe15PorCentoQuandoDesempenhoForBom() {
		service.concederReajuste(func, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), func.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDe20PorCentoQuandoDesempenhoForOtimo() {
		service.concederReajuste(func, Desempenho.ÓTIMO);
		assertEquals(new BigDecimal("1200.00"), func.getSalario());
	}
	
	@AfterEach
	public void depoisDeCada() {
		System.out.println("Depois de cada método.");
	}
	
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Depois de todos.");
	}
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Antes de todos.");
	}

}
