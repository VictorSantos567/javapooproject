package exerciciosPropostos;

import java.util.Scanner;

/**
 * @author victo Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
 *         �mpares de 1 at� X, um valor por linha, inclusive o X, se for o caso
 */
public class Exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X ;
		X = sc.nextInt();
		
		for(int i=0;i<=X;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
