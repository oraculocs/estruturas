package estruturasequencial;

import java.util.Scanner;

public class ExercicioProposto01 {
	
	/*
	 * Faça um programa para ler dois valores inteiros,
	 * e depois mostrar na tela a soma desses números com uma
	 * mensagem explicativa, conforme exemplos. 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int soma;
		
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
