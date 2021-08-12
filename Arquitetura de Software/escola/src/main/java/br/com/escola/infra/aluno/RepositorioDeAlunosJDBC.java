package br.com.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.escola.dominio.aluno.Telefone;

public class RepositorioDeAlunosJDBC implements RepositorioDeAlunos {
	
	private final Connection connection;
	
	public RepositorioDeAlunosJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void matricular(Aluno aluno) {
		try {
			String sql = "insert into aluno values(?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.execute();
			
			String sqlTelefone = "insert into telefone values(?, ?)";
			PreparedStatement ps2 = connection.prepareStatement(sqlTelefone);
			for(Telefone telefone : aluno.getTelefones()) {
				ps2.setString(1, telefone.getDdd());
				ps2.setString(2, telefone.getNumero());
				ps2.execute();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		// ...
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// ...
		return null;
	}

}
