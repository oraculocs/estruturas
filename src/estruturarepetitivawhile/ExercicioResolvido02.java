package estruturarepetitivawhile;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
		 * O último dado, que não entrará nos cálculos, contém um valor de idade negativa. 
		 * Calcular e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
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
			System.out.println("Impossível calcular");
		}
		
		while(idade >= 0) {
			somaIdade += idade;
			
			System.out.println("Digite outra idade: ");
			idade = sc.nextInt();
			
			contIdade++;
		}
		
		mediaIdade = somaIdade / contIdade;
		
		System.out.printf("Média de Idades: %.2f%n", mediaIdade);
		
		sc.close();
		

	}

}
