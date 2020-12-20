package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

/**
 * @author victo Fazer um programa para ler os valores da largura e altura de um
 *         retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro
 *         e diagonal
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();

		System.out.println(rectangle);

		sc.close();

	}

}
