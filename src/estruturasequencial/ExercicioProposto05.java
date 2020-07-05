package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto05 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler o c�digo de uma pe�a 1, 
		 * o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, 
		 * o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor 
		 * unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2;
		int numPeca1, numPeca2;
		double valorPeca1, valorPeca2;
		double valorPago;
		
		System.out.println("C�digo Pe�a1, N�mero Pe�a1, valorPe�a1");
		codigo1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		System.out.println("C�digo Pe�a2, N�mero Pe�a2, valorPe�a2");
		codigo2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorPago = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);
		
		
		sc.close();
	}

}
