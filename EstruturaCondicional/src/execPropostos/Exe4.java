package execPropostos;

import java.util.Scanner;

/**
 * @author victo
 *Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 */
public class Exe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi, hf, duracao;
		
		hi = sc.nextInt();
		hf = sc.nextInt();
 
		if(hi<hf) {
			duracao = hf - hi;
		}else duracao = 24 - hi + hf;
		
		System.out.println("O JOGO DUROU "+ duracao + " HORA(S)");
		sc.close();
	}

}
