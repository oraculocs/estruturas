package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido03 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler 3 números inteiros. Em seguida, mostral qual o
		 * menor dentre os 3 números lidos. Em caso de empate, mostrar apenas uma vez.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o Primeiro número");
		num1 = sc.nextInt();
		
		System.out.println("Digite o Segundo número");
		num2 = sc.nextInt();
		
		System.out.println("Digite o Terceiro número");
		num3 = sc.nextInt();
		
		if(num1 < num2) {
			System.out.println("MENOR = " + num1);
		}else if(num2 < num3) {
			System.out.println("MENOR = " + num2);
		}else {
			System.out.println("MENOR = " + num3);
		}
		
		sc.close();
	}

}
