package estruturasequencial;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		/*
		 * Faça um programa que peça um número e então
		 * mostre a mensagem O número foi informado [numero]
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		System.out.println("O número informado foi [" + num + "]");
		
		
		sc.close();
	}

}
