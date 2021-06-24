package pilha;
/**
 * Pilha
 * 
 * Organiza a execução do código, começando no main.
 * O que está no topo da pilha, é o que está sendo executado.
 * Remove da pilha o que já foi executado, até que esteja vazia (fim do main), 
 * então, o programa é encerrado.
 * 
 * Depuração
 * 
 * Ponto que aparece onde queremos que inicie o debug, se chama
 * ponto de depuração.
 * Permite observar em tempo real a pilha.
 * 
 * Exeções
 * As exceções são problemas que acontecem na hora de compilar o código. 
 * Considerando que existe uma variedade imensa, elas possuem nomes explicativos 
 * e, às vezes, mostram claramente o motivo de seu surgimento, facilitando a identificação delas. 
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
