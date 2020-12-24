package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

/**
 * @author victo Fazer um programa para ler o nome de um aluno e as tr�s notas
 *         que ele obteve nos tr�s trimestres do ano (primeiro trimestre vale 30
 *         e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota
 *         final do aluno no ano. Dizer tamb�m se o aluno est� aprovado (PASS)
 *         ou n�o (FAILED) e, em caso negativo, quantos pontos faltam para o
 *         aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve
 *         criar uma classe Student para resolver este problema.
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		student.name = sc.nextLine();
		student.firstQuarter = sc.nextDouble();
		student.secondQuarter = sc.nextDouble();
		student.thirdQuarter = sc.nextDouble();

		System.out.println("FINAL GRADE = " + student.finalGrade());
		student.approved();

		sc.close();
	}

}
