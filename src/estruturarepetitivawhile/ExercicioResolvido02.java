package estruturarepetitivawhile;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
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
