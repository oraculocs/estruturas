package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto04 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe 
		 * por hora e calcula o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, 
		 * com duas casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idFuncionario;
		int numHorasTrab;
		double valorHora;
		double salario;
		String nome;
		
		
		System.out.println("Matrícula Funcionário: ");
		idFuncionario = sc.nextInt();
		
		System.out.println("Nome Funcionário:");
		nome = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Número de Horas Trabalhadas: ");
		numHorasTrab = sc.nextInt();
		
		System.out.println("Valor Hora Trabalhada: ");
		valorHora = sc.nextDouble();
		
		
		salario = numHorasTrab * valorHora;
		
		System.out.println("NUMBER = " + idFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	
		
		sc.close();
	}

}
