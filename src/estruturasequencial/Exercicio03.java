package estruturasequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que pe�a 2 n�meros
		 * e imprima a soma.
		 */

		Scanner scan = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = scan.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma de " + num1 + " + " + num2 + " � = " + soma);
		
		
		scan.close();
	}

}
