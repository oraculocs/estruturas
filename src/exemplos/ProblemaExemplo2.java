package exemplos;

import java.util.Scanner;

public class ProblemaExemplo2 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um
		 * dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
		 * Escrever na tela o dia da semana correspondente, conforme exemplos.
		 * 
		 * 1										Dia da semana: domingo
		 * 4										Dia da semana: quarta
		 * 9										Dia da semana: valor inválido
		 */

		Scanner sc = new Scanner(System.in);
		
		int dia;
		String diaSemana = "";
		
		System.out.println("Digite um número de 1 a 7");
		dia = sc.nextInt();
		
		
		switch (dia) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda-feira";
			break;	
		case 3:
			diaSemana = "Terça-feira";
			break;
		case 4:
			diaSemana = "Quarta-feira";
			break;
		case 5:
			diaSemana = "Quinta-feira";
			break;
		case 6:
			diaSemana = "Sexta-feira";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		default:
			diaSemana = "Valor Inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + diaSemana);
		sc.close();
		
	}

}
