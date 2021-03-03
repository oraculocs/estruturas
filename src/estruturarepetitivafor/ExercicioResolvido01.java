package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		
		/*
		 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
		 * 1 x N = N	2 x N = 2N	....	10 x N = 10N
		 */

		Scanner sc = new Scanner(System.in);
		
		int N;
		int resultado = 0;
		
		System.out.println("Informe um valor: ");
		N = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			resultado = i * N;
			System.out.println(i + " x " + N + " = " + resultado);
		}
		
		
		
		sc.close();
	}

}
