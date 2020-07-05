package estruturarepetitivafor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto03 {

	public static void main(String[] args) {
		
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
		 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
		 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que 
		 * o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
		 * 
		 * Entrada							Saída
		 * 	3								5.7
			6.5 4.3 6.2						6.3
			5.1 4.2 8.1						9.3
			8.0 9.0 10.0
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double n1, n2, n3;
		double mediaPonderada;
		
		System.out.println("Informe a Quantidade de Casos de Testes: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Informe a primeira nota: ");
			n1 = sc.nextDouble();
			
			System.out.print("Informe a segunda nota: ");
			n2 = sc.nextDouble();
			
			System.out.print("Informe a terceira nota: ");
			n3 = sc.nextDouble();
			
			mediaPonderada = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		
		
		sc.close();
	}

}
