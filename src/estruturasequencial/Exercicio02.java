package estruturasequencial;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que pe�a um n�mero e ent�o
		 * mostre a mensagem O n�mero foi informado [numero]
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();
		
		System.out.println("O n�mero informado foi [" + num + "]");
		
		
		sc.close();
	}

}
