package calculadora;

// Chamar o m�todo dentro de main � uma esp�cie de teste automatizado manual.
// Por�m � uma pr�tica que requer mais tempo e n�o tem os resultados muito claros.
// Muitos cen�rios para serem previstos.

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
