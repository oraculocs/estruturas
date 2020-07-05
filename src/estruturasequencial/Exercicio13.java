package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que pergunte quanto você ganha por hora 
		 * e o número de horas trabalhadas no mês. 
		 * Calcule e mostre o total do seu salário no referido mês, 
		 * sabendo-se que são descontados 11% para o Imposto de Renda, 
		 * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
		 * Salário bruto
		 * a. quanto pagou ao INSS
		 * b. quanto pagou ao sindicato
		 * c. o salário líquido
		 * d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
		 * + Salário Bruto : R$ - IR (11%) : R$ - INSS(8%) : R$ - Sindicato (5%) : R$ = Salário Líquido : R$
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
		
		System.out.println("Quantas horas o Funcionário trabalha no mês?");
		numHoraTrab = sc.nextDouble();
		
		salarioBruto = valorHora * numHoraTrab;
		
		IR = salarioBruto * 0.11;
		INSS = salarioBruto * 0.08;
		descontoSindicato = salarioBruto * 0.05;
		totalDescontos = IR + INSS + descontoSindicato;
		salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("======================================================================================");
		System.out.println("Valor pago ao INSS: " + INSS);
		System.out.println("Desconto do Sindicato: " + descontoSindicato);
		System.out.println("Total de Descontos: " + totalDescontos);
		System.out.println("Salário Líquido: " + salarioLiquido);
		System.out.println("======================================================================================");
		
		
		sc.close();
		
	}

}
