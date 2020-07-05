package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que pergunte quanto voc� ganha por hora 
		 * e o n�mero de horas trabalhadas no m�s. 
		 * Calcule e mostre o total do seu sal�rio no referido m�s, 
		 * sabendo-se que s�o descontados 11% para o Imposto de Renda, 
		 * 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
		 * Sal�rio bruto
		 * a. quanto pagou ao INSS
		 * b. quanto pagou ao sindicato
		 * c. o sal�rio l�quido
		 * d. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
		 * + Sal�rio Bruto : R$ - IR (11%) : R$ - INSS(8%) : R$ - Sindicato (5%) : R$ = Sal�rio L�quido : R$
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double valorHora, numHoraTrab;
		Double salarioLiquido;
		Double IR;
		Double descontoSindicato;
		Double salarioBruto;
		Double totalDescontos;
		Double INSS;
		
		System.out.println("Qual o valor da Hora Trabalhada?");
		valorHora = sc.nextDouble();
		
		System.out.println("Quantas horas o Funcion�rio trabalha no m�s?");
		numHoraTrab = sc.nextDouble();
		
		salarioBruto = valorHora * numHoraTrab;
		
		IR = salarioBruto * 0.11;
		INSS = salarioBruto * 0.08;
		descontoSindicato = salarioBruto * 0.05;
		totalDescontos = IR + INSS + descontoSindicato;
		salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("Sal�rio Bruto: " + salarioBruto);
		System.out.println("======================================================================================");
		System.out.println("Valor pago ao INSS: " + INSS);
		System.out.println("Desconto do Sindicato: " + descontoSindicato);
		System.out.println("Total de Descontos: " + totalDescontos);
		System.out.println("Sal�rio L�quido: " + salarioLiquido);
		System.out.println("======================================================================================");
		
		
		sc.close();
		
	}

}
