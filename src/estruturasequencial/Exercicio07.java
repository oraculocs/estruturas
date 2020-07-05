package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que calcule a área de um
		 * quadrado, em seguida mostre o dobro desta
		 * área para o usuário.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double lado1, lado2, area, dobroArea;
		
		System.out.println("Digite o valor do Lado1: ");
		lado1 = sc.nextDouble();
		
		System.out.println("Digite o valor do Lado2: ");
		lado2 = sc.nextDouble();
		
		area = lado1 * lado2;
		dobroArea = area * area;
		
		System.out.println("A área de um quadrado é = " + area);
		System.out.println("O dobro da área de um quadrado é = " + dobroArea);
		
	}

}
