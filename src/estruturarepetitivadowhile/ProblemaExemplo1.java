package estruturarepetitivadowhile;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo1 {

	public static void main(String[] args) {
		
		/*
		 * Faça uma programa para converter de Celsius para Farenheit
		 *  e perguntar ao usuário se deseja repetir a operação
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		String pergunta = "";
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			
			F = ((9 * C) / 5) + 32;
			
			System.out.println("Equivalente em Fahrenheit: " + F);
			
			sc.nextLine();
			System.out.println("Deseja repetir (s/n)?");
			pergunta = sc.nextLine();
		} while (pergunta.equalsIgnoreCase("s"));
		
		sc.close();
	}

}
