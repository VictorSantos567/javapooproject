package execPropostos;

import java.util.Scanner;

/**
 * @author victo
 *Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
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
