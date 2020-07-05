package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que pergunte quanto voc� ganha
		 * por hora e o seu n�mero de horas trabalhadas no
		 * m�s. Calcule e mostre o total do seu sal�rio no
		 * referido m�s.
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
		
		System.out.println("Matr�cula = " + idFuncionario);
		System.out.println("Nome do Funcion�rio: " + nome);
		System.out.println("Sal�rio = R$ " + salario);
	
		
		sc.close();
	}

}
