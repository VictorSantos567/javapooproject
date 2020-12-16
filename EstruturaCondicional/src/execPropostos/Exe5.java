package execPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		float quant;
		
		codigo = sc.nextInt();
		quant = sc.nextFloat();
		
		if(codigo == 1) {
			System.out.printf("Total: R$ %.2f%n ", quant * 4.00 );
		}else if(codigo == 2) {
			System.out.printf("Total: R$ %.2f%n ", quant * 4.50 );
		}else if(codigo == 3) {
			System.out.printf("Total: R$ %.2f%n ", quant * 5.00 );
		}else if(codigo == 4) {
			System.out.printf("Total: R$ %.2f%n ", quant * 2.00 );
		}else if(codigo == 5) {
			System.out.printf("Total: R$ %.2f%n ", quant * 1.50 );
		}else System.out.println("Não existe este codigo");
		
		
		sc.close();

	}

}
