package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {

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
