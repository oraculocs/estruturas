package estruturasequencial;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		/*
		 * Faça um Programa que peça a temperatura em graus
		 * Farenheit, transforme e mostre a temperatura em
		 * graus Celsius.
		 * C = (5 * (F - 32) / 9).
		 */

		Scanner sc = new Scanner(System.in);
		
		double C, F;
		
		System.out.println("Digite quantos Graus em Farenheit");
		F = sc.nextDouble();
		
		C = ((5 * (F - 32)) / 9);
		
		System.out.println(F + " graus Farenheit é = " + C + " graus Celsius ");
		
		sc.close();
	}

}
