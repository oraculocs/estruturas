package estruturarepetitivawhile;

import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite um valor para X: ");
		x = sc.nextInt();
		
		System.out.println("Digite um valor para Y:");
		y = sc.nextInt();
		
			
		while(x != y) {
			
			if(x < y) {
				System.out.println("Crescente");
			}else {
				System.out.println("Decrescente");
			}
			
			System.out.println("Digite um valor para X: ");
			x = sc.nextInt();
			
			System.out.println("Digite um valor para Y:");
			y = sc.nextInt();
		}
		
		
		
		sc.close();
	}

}
