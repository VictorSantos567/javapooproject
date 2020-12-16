package curso_programacao;

import java.util.Locale;

public class App {
	// Demostração de casting transformando o resultado int
	// para double
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int a = 5, b = 2;

		double resultado;
		

		resultado = (double) a / b; //casting

		System.out.println(resultado);

	}

}
