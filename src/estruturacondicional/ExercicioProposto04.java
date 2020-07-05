package estruturacondicional;

import java.util.Scanner;

public class ExercicioProposto04 {

	public static void main(String[] args) {
		
		/*
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
	
		Scanner sc = new Scanner(System.in);
		
		int horaIni, horaFinal, duracao;
		
		System.out.println("Digite a hora Inicial: ");
		horaIni = sc.nextInt();
		
		System.out.println("Digite a hora Final: ");
		horaFinal = sc.nextInt();
		
		if(horaIni < horaFinal) {
			duracao = horaFinal - horaIni;
		}else {
			duracao = 24 - horaIni + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + "HORA(S)");
		
		sc.close();
	}

}
