package execPropostos;

import java.util.Scanner;

/**
 * @author victo
 *Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
 */
public class Exe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		
		if(n<0){
			System.out.println("NEGATIVO");
		}else System.out.println("NAO NEGATIVO");
		
		sc.close();
		

	}

}
