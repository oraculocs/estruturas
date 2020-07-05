package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioProposto06 {

	public static void main(String[] args) {
		
		/*
		 * Ler um número inteiro N e calcular todos os seus divisores.
		 * 
		 * Entrada				Saída
		 * 6					1
		 * 						2
		 * 						3
		 * 						6
		 */

		Scanner sc = new Scanner(System.in);
		
		int n;
		
		
		System.out.println("Informe um número: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		
		
		sc.close();
	}

}
