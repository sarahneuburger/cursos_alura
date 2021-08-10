package escola;

public class FabricaDeAlunos {

	private Aluno aluno;

	public FabricaDeAlunos comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public FabricaDeAlunos comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
	public static void main(String[] args) {
		// Exemplo utilizando a classe
		FabricaDeAlunos fabrica = new FabricaDeAlunos();
		Aluno alunoRetornado = fabrica.comNomeCPFEmail("Sarah", "55555555", "teste@email.com")
				.comTelefone("55", "9898989898")
				.comTelefone("51", "8787878755")
				.criar();
	}
	
}
