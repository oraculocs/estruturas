package exemplos;

import java.util.Scanner;

public class ProblemaExemplo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dia;
		String diaSemana = "";
		
		System.out.println("Digite um n�mero de 1 a 7");
		dia = sc.nextInt();
		
		
		switch (dia) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda-feira";
			break;	
		case 3:
			diaSemana = "Ter�a-feira";
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
			diaSemana = "S�bado";
			break;
		default:
			diaSemana = "Valor Inv�lido";
			break;
		}
		
		System.out.println("Dia da semana: " + diaSemana);
		sc.close();
		
	}

}
