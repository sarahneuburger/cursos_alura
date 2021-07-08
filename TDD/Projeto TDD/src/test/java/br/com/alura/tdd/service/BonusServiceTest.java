package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	// Três testes, um com valor menor, um com maior e um com o valor da regra
	
	// Testar exception
	// Primeira possibilidade
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {
		BonusService service = new BonusService();
		// () -> lambda com o método a ser chamado
		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Sarah", LocalDate.now(), new BigDecimal(11000))));
	}
	
	// Segunda possibilidade
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto2() {
		BonusService service = new BonusService();
		try {
		service.calcularBonus(new Funcionario("Sarah", LocalDate.now(), new BigDecimal(11000)));
		fail("Não lançou a exception.");
			
		} catch (Exception e) {
			assertEquals("Funcionário com salário maior do que R$1000,00, não pode receber bônus.", e.getMessage());
		}
}
	
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Sarah", LocalDate.now(), new BigDecimal(2500)));
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	// Importante conhecer a regra de negócio
	@Test
	void bonusDeveriaSer10PorCentoParaSalarioDeDezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Sarah", LocalDate.now(), new BigDecimal(10000)));
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
	
	
	
	
	

}
