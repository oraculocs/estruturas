package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	
	/*
	 * Faça um programa que peça as 4 notas 
	 * bimestrais e mostre a média.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		
		System.out.println("Digite a Nota1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a Nota2: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite a Nota3: ");
		n3 = sc.nextDouble();
		
		System.out.println("Digite a Nota4: ");
		n4 = sc.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("A média final é = %.1f%n", media);
				
				
		sc.close();
	}

}
