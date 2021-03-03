package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		
		
		/*
		 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
		 * segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que
		 * o aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
		 * seja inferiro a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos os valores
		 * devem ter uma casa decimal.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double notaFinal;
		
		System.out.println("Digite a Primeira Nota: ");
		nota1 = sc.nextDouble();

		System.out.println("Digite a Segunda Nota: ");
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		
		if(notaFinal < 60.0){
			System.out.printf("NOTA FINAL : %.1f%n", notaFinal);
			System.out.println("REPROVADO");
		}else {
			System.out.printf("NOTA FINAL : %.1f%n", notaFinal);
		}
		
		
		
		sc.close();

	}

}
