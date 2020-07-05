package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioProposto01 {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000).
		 * Em seguida mostre os ímpares de 1 até X, 
		 * um valor por linha, inclusive o X, se for o caso.
		 * 
		 * Entrada					Saída
		 * 8						1
		 * 							3
		 * 							5
		 * 							7
		 */

		Scanner sc = new Scanner(System.in);
		
		
		int valor;
		
		System.out.println("Informe um valor: ");
		valor = sc.nextInt();
		
		for(int i = 1; i <= valor; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
