package estruturasequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que peça 2 números
		 * e imprima a soma.
		 */

		Scanner scan = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma de " + num1 + " + " + num2 + " é = " + soma);
		
		
		scan.close();
	}

}
