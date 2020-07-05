package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que pergunte quanto você ganha
		 * por hora e o seu número de horas trabalhadas no
		 * mês. Calcule e mostre o total do seu salário no
		 * referido mês.
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
		
		System.out.println("Matrícula = " + idFuncionario);
		System.out.println("Nome do Funcionário: " + nome);
		System.out.println("Salário = R$ " + salario);
	
		
		sc.close();
	}

}
