package pilha;
/**
 * Pilha
 * 
 * Organiza a execu��o do c�digo, come�ando no main.
 * O que est� no topo da pilha, � o que est� sendo executado.
 * Remove da pilha o que j� foi executado, at� que esteja vazia (fim do main), 
 * ent�o, o programa � encerrado.
 * 
 * Depura��o
 * 
 * Ponto que aparece onde queremos que inicie o debug, se chama
 * ponto de depura��o.
 * Permite observar em tempo real a pilha.
 * 
 * Exe��es
 * As exce��es s�o problemas que acontecem na hora de compilar o c�digo. 
 * Considerando que existe uma variedade imensa, elas possuem nomes explicativos 
 * e, �s vezes, mostram claramente o motivo de seu surgimento, facilitando a identifica��o delas. 
 *
 */

public class Fluxo {
	
	 public static void main(String[] args) {
	        System.out.println("Ini do main");
	        metodo1();
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");
	        for(int i = 1; i <= 5; i++) {
	            System.out.println(i);
	        }
	        System.out.println("Fim do metodo2");
	    }

}
