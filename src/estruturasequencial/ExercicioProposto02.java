package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto02 {

	public static void main(String[] args) {
		
		/*
		 * Faca um programa para ler o valor do raio de um circulo, 
		 * e depois mostrar o valor da area deste circulo com quatro 
		 * casas decimais conforme exemplos. 
		 * Formula da área: area = PI . raio * raio 
		 * Considere o valor de PI = 3.14159
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		double raio;
		double area;
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("A= %.4f%n", area);
		
		sc.close();
	}

}
