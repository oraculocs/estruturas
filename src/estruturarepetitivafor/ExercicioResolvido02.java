package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int soma = 0;
		int min, max;
		
		System.out.println("Informe o valor de X: ");
		x = sc.nextInt();
		
		System.out.println("Informe o valor de Y: ");
		y = sc.nextInt();
		
		if(x < y) {
			min = x;
			max = y;
		}else {
			min = y;
			max = x;
		}
		
		for(int i = min + 1; i < max; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		
		
		System.out.println(soma);
		
		sc.close();
	}

}
