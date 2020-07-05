package estruturarepetitivawhile;

import java.util.Scanner;

public class ExercicioProposto02 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma 
		 * quantidade indeterminada de pontos no sistema cartesiano.
		 * Para cada ponto escrever o quadrante a que ele pertence. 
		 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		 * 
		 * Entrada 				Saída
		 * 	2 2					primeiro
			3 -2				quarto
			-8 -1				terceiro
			-7 1				segundo
			0 2
		 */

		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		
		System.out.println("Informe um valor para X: ");
		X = sc.nextInt();
		
		System.out.println("Informe um valor para Y: ");
		Y = sc.nextInt();
		
		while(X != 0 && Y != 0) {
			if(X > 0 && Y > 0) {
				System.out.println("primeiro");
			}else if(X > 0 && Y < 0) {
				System.out.println("quarto");
			}else if(X < 0  && Y < 0) {
				System.out.println("terceiro");
			}else if(X < 0 && Y > 0) {
				System.out.println("segundo");
			}
			
			System.out.println("Informe um valor para X: ");
			X = sc.nextInt();
			
			System.out.println("Informe um valor para Y: ");
			Y = sc.nextInt();
		}
		
		
		
		sc.close();
	}

}
