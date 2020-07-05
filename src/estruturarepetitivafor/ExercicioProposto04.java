package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioProposto04 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um n�mero N. 
		 * Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
		 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 * 
		 * Entrada					Sa�da
		 * 	3						-1.5
			3 -2					divisao impossivel
			-8 0					0.0
			0 8
		 */

		Scanner sc = new Scanner(System.in);
		
		int n;
		int x, y;
		double divisao;
		
		System.out.println("Informe a quantidade de n�meros que ser�o lidos: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Informe um n�mero: ");
			x = sc.nextInt();
			
			System.out.println("Informe um n�mero: ");
			y = sc.nextInt();
			
			divisao = (double) x / y;
			
			if(y == 0) {
				System.out.println("divisao impossivel");
			}else {
				System.out.println(divisao);
			}

		}
		
		
		
		
		sc.close();
	}

}
