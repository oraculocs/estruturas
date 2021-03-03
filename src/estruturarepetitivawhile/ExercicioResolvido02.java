package estruturarepetitivawhile;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um, a idade de um indiv�duo.
		 * O �ltimo dado, que n�o entrar� nos c�lculos, cont�m um valor de idade negativa. 
		 * Calcular e imprimir a idade m�dia deste grupo de indiv�duos. Se for entrado um valor negativo na primeira vez,
		 * mostrar a mensagem "impossivel calcular".
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		double somaIdade = 0;
		double mediaIdade = 0;
		int contIdade = 0;
		
		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();
		
		if(idade < 0) {
			System.out.println("Imposs�vel calcular");
		}
		
		while(idade >= 0) {
			somaIdade += idade;
			
			System.out.println("Digite outra idade: ");
			idade = sc.nextInt();
			
			contIdade++;
		}
		
		mediaIdade = somaIdade / contIdade;
		
		System.out.printf("M�dia de Idades: %.2f%n", mediaIdade);
		
		sc.close();
		

	}

}
