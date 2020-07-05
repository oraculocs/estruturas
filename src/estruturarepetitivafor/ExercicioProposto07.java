package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioProposto07 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro positivo N. 
		 * O programa deve então mostrar na tela N linhas, começando de 1 até N. 
		 * Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
		 * 
		 * Entrada					Saída
		 * 5						1 1 1 
		 * 							2 4 8
		 * 							3 9 27
		 * 							4 16 64
		 * 							5 25 125
		 */

		Scanner sc = new Scanner(System.in);
		
		int n;
		int quadrado;
		double cubo;
		
		System.out.println("Informe um número inteiro positivo: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			quadrado = i * i;
			cubo = Math.pow(i, 3);
			System.out.print(i + " ");
			System.out.print(quadrado + " ");
			System.out.printf("%.0f%n", cubo);
			
		}
		
		
		
		sc.close();
	}

}
