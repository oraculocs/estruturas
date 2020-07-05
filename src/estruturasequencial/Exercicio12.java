package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		/*
		 * Tendo como dados de entrada altura de uma pessoa, 
		 * construa um algoritmo que calcule seu peso ideal, 
		 * usando a seguinte fórmula: (72.7 * altura) – 58
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura;
		double imc;
		
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		
		imc = (72.7 * altura) - 58;
		
		System.out.println("Peso Ideal: " + imc + " kg");
		
		
		sc.close();
	}

}
