package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	// O nome tem que deixar claro o que irá testar
	
	// JUnit também pode ser adicionado como depenência no maven
	
	// Declarado como se fosse um método normal, chamando a anotação "test"
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		assertEquals(10, soma);
	}

}
