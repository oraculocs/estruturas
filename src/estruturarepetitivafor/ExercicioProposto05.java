package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioProposto05 {

	public static void main(String[] args) {
		
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial.
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por defini��o, fatorial de 0 � 1.
		 * 
		 * Entrada					Sa�da
		 * 4						24
		 */

		Scanner sc = new Scanner(System.in);
		
		
		int n;
		int fatorial = 1;
		
		System.out.println("Informe um n�mero para calcular seu fatorial: ");
		n = sc.nextInt();
		
		
		for(int i = n; i > 0  ; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}
