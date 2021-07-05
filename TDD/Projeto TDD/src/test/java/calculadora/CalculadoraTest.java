package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	// O nome tem que deixar claro o que ir� testar
	
	// JUnit tamb�m pode ser adicionado como depen�ncia no maven
	
	// Declarado como se fosse um m�todo normal, chamando a anota��o "test"
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		assertEquals(10, soma);
	}

}
