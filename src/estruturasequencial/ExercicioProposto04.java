package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto04 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, 
		 * seu n�mero de horas trabalhadas, o valor que recebe 
		 * por hora e calcula o sal�rio desse funcion�rio. 
		 * A seguir, mostre o n�mero e o sal�rio do funcion�rio, 
		 * com duas casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idFuncionario;
		int numHorasTrab;
		double valorHora;
		double salario;
		String nome;
		
		
		System.out.println("Matr�cula Funcion�rio: ");
		idFuncionario = sc.nextInt();
		
		System.out.println("Nome Funcion�rio:");
		nome = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("N�mero de Horas Trabalhadas: ");
		numHorasTrab = sc.nextInt();
		
		System.out.println("Valor Hora Trabalhada: ");
		valorHora = sc.nextDouble();
		
		
		salario = numHorasTrab * valorHora;
		
		System.out.println("NUMBER = " + idFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	
		
		sc.close();
	}

}
