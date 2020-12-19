package exerciciosPropostos;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int l1 = i;
			int l2 = (int) Math.pow(i, 2);
			int l3 = (int) Math.pow(i, 3);
			System.out.println(l1+" "+l2+" "+l3);
		}

		sc.close();
	}

}
