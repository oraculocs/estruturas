package estruturarepetitivafor;

import java.util.Scanner;

public class ExercicioProposto02 {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X 
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro 
		 * do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações 
		 * conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 * 
		 * Entrada					Saída
		 * 	5						2 in
			14						3 out
			123
			10
			-25
			32
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int x;
		int qtdIn = 0;
		int qtdOut = 0;
		
		System.out.println("Informe um valor: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Informe um número: ");
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				qtdIn++;
			}else {
				qtdOut++;
			}
		}
		
		System.out.println(qtdIn + " in");
		System.out.println(qtdOut + " out");
		
		sc.close();
	}

}
