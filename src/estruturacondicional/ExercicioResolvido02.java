package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para calcular a Fórmula de Baskara
		 * Leia 3 valores de ponto flutuante (double) A, B e C.
		 * Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossível calcular"
		 * Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente
		 * conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
		 * 
		 * 10.0 20.1 5.1								x1 = -0.29788
		 * 												x2 = -1.71212
		 * 
		 * 0.0 20.0 5.0									Impossível calcular
		 * 
		 * 10.3 203.0 5.0								x1 = -0.02466
		 * 												x2 = -19.68408
		 * 
		 * 10.0 3.0 5.0									Impossível calcular
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite um valor para (a)");
		a = sc.nextDouble();
		
		System.out.println("Digite um valor para (b)");
		b = sc.nextDouble();
		
		System.out.println("Digite um valor para (c)");
		c = sc.nextDouble();
		
		delta = (b * b) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2 * a); 
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		if(a <= 0 || delta <= 0) {
			System.out.println("Impossível calcular!");
		}else {
			System.out.printf("R1 = %.5f%n", x1);
			System.out.printf("R2 = %.5f%n", x2);
		}
		
		sc.close();
	}

	
	
}
