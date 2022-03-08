package ed.listaligada;

public class ListaLigada {
	
	private Celula primeira = null;
	private int totalDeElementos = 0;
	
	public void adiciona(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;
		
		this.totalDeElementos++;
	}
	
	public void adiciona(int posicao, Object elemento) {}
	
	public Object pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {}
	
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object elemento) {
		return false;
	}
	
	@Override
	public String toString() {
		if(totalDeElementos == 0) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");
		
		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			
			atual = atual.getProximo();
		}
		
		builder.append("]");
		return builder.toString();
	}
	

}
