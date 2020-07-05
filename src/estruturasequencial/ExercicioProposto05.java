package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto05 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler o código de uma peça 1, 
		 * o número de peças 1, o valor unitário de cada peça 1, 
		 * o código de uma peça 2, o número de peças 2 e o valor 
		 * unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2;
		int numPeca1, numPeca2;
		double valorPeca1, valorPeca2;
		double valorPago;
		
		System.out.println("Código Peça1, Número Peça1, valorPeça1");
		codigo1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Código Peça2, Número Peça2, valorPeça2");
		codigo2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorPago = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);
		
		
		sc.close();
	}

}
