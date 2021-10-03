package br.com.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import br.com.alura.escola.academico.dominio.evento.Evento;
import br.com.alura.escola.academico.dominio.evento.TipoDeEvento;
import br.com.alura.escola.shared.dominio.CPF;

// Representa o evento de aluno matriculado
// Evneto de dom�nio: a aplica��o reagir a eventos de forma flex�vel.
// Trabalhando com eventos, o mesmo evento pode gerar v�rias a��es, 
// o que nos d� muita flexibilidade.
public class AlunoMatriculado implements Evento {

	private final CPF cpfDoAluno;
	private final LocalDateTime momento;
	
	public AlunoMatriculado(CPF cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoes() {
		return Map.of("CPF", cpfDoAluno);
	}

}
