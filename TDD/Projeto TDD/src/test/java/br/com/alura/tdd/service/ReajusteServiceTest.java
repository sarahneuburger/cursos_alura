package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	// Implementar os testes antes dos métodos
	// Rascunho antes dos métodos
	// Ajuda a entender como implementar os métodos
	@Test
	public void reajusteDeveriaSerDe3PorCentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario func = new Funcionario("Sarah", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(func, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), func.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDe15PorCentoQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario func = new Funcionario("Sarah", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(func, Desempenho.BOM);
		
		assertEquals(new BigDecimal("1150.00"), func.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDe20PorCentoQuandoDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario func = new Funcionario("Sarah", LocalDate.now(), new BigDecimal("1000.00"));
		
		service.concederReajuste(func, Desempenho.ÓTIMO);
		
		assertEquals(new BigDecimal("1200.00"), func.getSalario());
		
	}

}
