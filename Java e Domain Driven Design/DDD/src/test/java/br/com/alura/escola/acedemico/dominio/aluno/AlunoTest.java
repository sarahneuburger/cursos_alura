package br.com.alura.escola.acedemico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.CPF;
import br.com.alura.escola.academico.dominio.aluno.Email;

public class AlunoTest {

	private Aluno aluno;

	@BeforeEach
	public void beforeEach() {
		this.aluno = new Aluno(new CPF("123.456.789-10"), "Fulano da Silva", new Email("fulano@email.com"));
	}

	@Test
	void deveriaPermitirAdicionar1Telefone() {
		this.aluno.adicionarTelefone("11", "999887755");
		assertEquals(1, this.aluno.getTelefones().size());
	}

	@Test
	void deveriaPermitirAdicionar2Telefone() {
		this.aluno.adicionarTelefone("11", "999999999");
		this.aluno.adicionarTelefone("11", "888888888");
		assertEquals(2, this.aluno.getTelefones().size());
	}

	@Test
	void deveriaPermitirAdicionar3Telefone() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.aluno.adicionarTelefone("11", "777777777");
			this.aluno.adicionarTelefone("11", "999999999");
			this.aluno.adicionarTelefone("11", "888888888");
		});
	}

}
