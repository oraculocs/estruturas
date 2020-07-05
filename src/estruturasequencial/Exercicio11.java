package estruturasequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que peça 2 números inteiros e um número real. 
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
		
		
		System.out.println("Digite um número inteiro: ");
		num1 = sc.nextInt();

		System.out.println("Digite outro número inteiro: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite um número real: ");
		num3 = sc.nextDouble();
		
		produto = (num1 * num1) * num2 /2;
		soma = (num1 * 3) + num3;
		
		c = Math.pow(num3, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é = " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro é = " + soma);
		System.out.println("O terceiro elevado ao cubo é = " + c);
	}

}
