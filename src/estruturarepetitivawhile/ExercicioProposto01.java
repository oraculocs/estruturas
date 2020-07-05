package estruturarepetitivawhile;

import java.util.Scanner;

public class ExercicioProposto01 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida.
		 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
		 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
		 * e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
		 * 
		 * Exemplo:
			Entrada: 			Sa�da:
			2200				Senha Invalida
			1020				Senha Invalida
			2022				Senha Invalida
			2002				Acesso Permitido
			
		 */

		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Informe uma senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			
			System.out.println("Senha Inv�lida");
			
			System.out.println("Informe uma senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
	}

}
