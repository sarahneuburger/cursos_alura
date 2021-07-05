package calculadora;

// Chamar o método dentro de main é uma espécie de teste automatizado manual.
// Porém é uma prática que requer mais tempo e não tem os resultados muito claros.
// Muitos cenários para serem previstos.

public class CalculadoraMain {

	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int res = calc.somar(10, 10);
		System.out.println(res);
		
		res = calc.somar(0, 3);
		System.out.println(res);
		
		res = calc.somar(3, -1);
		System.out.println(res);
		
	}
}
