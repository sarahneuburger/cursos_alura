package br.com.alura.banco;

public class TarefaAcessoBanco implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessoBanco(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {

		synchronized (pool) {
			System.out.println("Pegar a chave pool.");
			pool.getConnection();

			synchronized (tx) {
				System.out.println("Come�ar a gerenciar a ex.");
				tx.begin();
			}
		}

	}

}
