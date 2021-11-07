package br.com.alura.banco;

public class AcessaBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public AcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Começando a gerenciar a tx.");
			pool.getConnection();
			
			synchronized (tx) {
				System.out.println("Começando a tx.");
				tx.begin();
			}
			
		}
	}

}
