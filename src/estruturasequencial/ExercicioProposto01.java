package estruturasequencial;

import java.util.Scanner;

public class ExercicioProposto01 {
	
	/*
	 * Fa�a um programa para ler dois valores inteiros,
	 * e depois mostrar na tela a soma desses n�meros com uma
	 * mensagem explicativa, conforme exemplos. 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int soma;
		
		System.out.println("Digite um n�mero: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
