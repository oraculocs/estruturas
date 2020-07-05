package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que peça o raio de um
		 * círculo, calcule e mostre sua área.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		double raio;
		double area;
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = PI * Math.pow(raio, 2);
		
		System.out.println("Área = " +  area);
		
		sc.close();
	}

}
