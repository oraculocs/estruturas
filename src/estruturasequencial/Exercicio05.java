package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que converta metros em centímetros
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double metros, cm;
		
		System.out.println("Digite em metros");
		metros = sc.nextDouble();
		
		cm = metros * 100;
		
		System.out.println("Em " + metros + " metros tem " + cm + " cm");
		
		sc.close();
		
	}

}
