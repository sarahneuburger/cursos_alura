package br.com.alura.rh.model;

/**
 * Exemplo de heran�a indesejada: terceirizado herdando funcionario.
 * Neste caso, herda coisas desnecess�rias (promo��o e reajuste).
 * Como alguns dados s�o repetidos, criamos a classe DadosPessoais (composi��o).
 * Focar na composi��o ao inv�s da heran�a.
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
