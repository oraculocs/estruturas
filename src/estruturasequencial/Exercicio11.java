package estruturasequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que pe�a 2 n�meros inteiros e um n�mero real. 
		 * Calcule e mostre: 
		 * a. O produto do dobro do primeiro com metade do segundo.
		 * b. A soma do triplo do primeiro com o terceiro. 
		 * c. O terceiro elevado ao cubo
		 */

		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double num3;
		
		double produto = 0;
		double soma = 0;
		double c = 0;
		
		
		System.out.println("Digite um n�mero inteiro: ");
		num1 = sc.nextInt();

		System.out.println("Digite outro n�mero inteiro: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite um n�mero real: ");
		num3 = sc.nextDouble();
		
		produto = (num1 * num1) * num2 /2;
		soma = (num1 * 3) + num3;
		
		c = Math.pow(num3, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo � = " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro � = " + soma);
		System.out.println("O terceiro elevado ao cubo � = " + c);
	}

}
