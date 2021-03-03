package estruturarepetitivawhile;

import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		
		/*
		 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem
		 * que indique se estes valores foram digitados em ordem crescente ou decrescente.
		 * Entrada:
		 * A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura deve
		 * ser encerrada ao ser fornecido valores iguais para X e Y.	
		 * Saída:
		 * Para cada caso de teste imprima "Crescente", caso os valores tenham sido digitados na ordem crescente, 
		 * caso contrário imprima a mensagem "Decrescente" 
		 * 
		 * Exemplo de Entrada
		 * 5 4						Decrescente
		 * 7 2						Decrescente
		 * 3 8						Crescente
		 * 2 2 
		 */

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite um valor para X: ");
		x = sc.nextInt();
		
		System.out.println("Digite um valor para Y:");
		y = sc.nextInt();
		
			
		while(x != y) {
			
			if(x < y) {
				System.out.println("Crescente");
			}else {
				System.out.println("Decrescente");
			}
			
			System.out.println("Digite um valor para X: ");
			x = sc.nextInt();
			
			System.out.println("Digite um valor para Y:");
			y = sc.nextInt();
		}
		
		
		sc.close();
	}

}
