package exec_propostos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author victo
 *Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B
 */
public class Exe6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A=0,B=0,C=0;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", A*C/2);
		System.out.printf("CIRCULO: %.3f%n", 3.14159*Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f%n", ((A+B)*C)/2);
		System.out.printf("QUADRADO: %.3f%n", B*B);
		System.out.printf("RETANGULO: %.3f%n", A*B);
	}

}
