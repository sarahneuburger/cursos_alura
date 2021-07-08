package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	// Tr�s testes, um com valor menor, um com maior e um com o valor da regra
	
	// Testar exception
	// Primeira possibilidade
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {
		BonusService service = new BonusService();
		// () -> lambda com o m�todo a ser chamado
		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Sarah", LocalDate.now(), new BigDecimal(11000))));
	}
	
	// Segunda possibilidade
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto2() {
		BonusService service = new BonusService();
		try {
		service.calcularBonus(new Funcionario("Sarah", LocalDate.now(), new BigDecimal(11000)));
		fail("N�o lan�ou a exception.");
			
		} catch (Exception e) {
			assertEquals("Funcion�rio com sal�rio maior do que R$1000,00, n�o pode receber b�nus.", e.getMessage());
		}
}
	
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Sarah", LocalDate.now(), new BigDecimal(2500)));
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	// Importante conhecer a regra de neg�cio
	@Test
	void bonusDeveriaSer10PorCentoParaSalarioDeDezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Sarah", LocalDate.now(), new BigDecimal(10000)));
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
	
	
	
	
	

}
