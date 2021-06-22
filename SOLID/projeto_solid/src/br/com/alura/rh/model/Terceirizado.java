package br.com.alura.rh.model;

/**
 * Exemplo de herança indesejada: terceirizado herdando funcionario.
 * Neste caso, herda coisas desnecessárias (promoção e reajuste).
 * Como alguns dados são repetidos, criamos a classe DadosPessoais (composição).
 * Focar na composição ao invés da herança.
 */
public class Terceirizado {

	private DadosPessoais dadosPessoais;
	private String empresa;

	public Terceirizado(DadosPessoais dadosPessoais, String empresa) {
		super();
		this.dadosPessoais = dadosPessoais;
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	

}
