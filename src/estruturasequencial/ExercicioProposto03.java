package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto03 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		 * A seguir, calcule e mostre a diferença do produto
		 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		int DIFERENCA;
		
		System.out.println("Digite o Primeiro Valor: ");
		A = sc.nextInt();
		
		System.out.println("Digite o Segundo Valor: ");
		B = sc.nextInt();

		System.out.println("Digite o Terceiro Valor: ");
		C = sc.nextInt();
		
		System.out.println("Digite o Quarto Valor: ");
		D = sc.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();
	}

}
