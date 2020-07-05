package estruturasequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que peça a temperatura em 
		 * graus Celsius, transforme e mostre em graus
		 * Farenheit.
		 */
		
		
		Scanner sc = new Scanner(System.in);

		double C, F;

		System.out.println("Digite quantos Graus em Celsius");
		C = sc.nextDouble();

		F = ((C * 9) / 5) + 32;

		System.out.println(C + " graus Celsius é = " + F + " graus Farenheit ");

		sc.close();
	}

}
