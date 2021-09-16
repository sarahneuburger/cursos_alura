package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	// Guardador gen�rico com a classe Object
	private Object[] referencias;
	private int posicaoLivre;
	
	// A inten��o desta classe � facilitar a sintaxe do Array, tratando internamente
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	// Quando adicionar, vai pulando para a pr�xima posi��o livre
	public void adicionar(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
		
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int posicao) {
		return this.referencias[posicao];
	}

}
