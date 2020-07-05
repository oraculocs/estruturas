package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		
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
		
		if(notaFinal < 60.00){
			System.out.println("NOTA FINAL : " + notaFinal);
			System.out.println("REPROVADO");
		}else {
			System.out.println("NOTA FINAL : " + notaFinal);
		}
		
		
		
		sc.close();

	}

}
