package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que calcule a �rea de um
		 * quadrado, em seguida mostre o dobro desta
		 * �rea para o usu�rio.
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
		
		System.out.println("A �rea de um quadrado � = " + area);
		System.out.println("O dobro da �rea de um quadrado � = " + dobroArea);
		
	}

}
