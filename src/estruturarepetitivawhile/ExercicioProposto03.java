package estruturarepetitivawhile;

import java.util.Scanner;

public class ExercicioProposto03 {

	public static void main(String[] args) {
		
		/*
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. 
		 * Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 
		 * 1.�lcool 2.Gasolina 3.Diesel 4.Fim). 
		 * Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
		 * que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme exemplo.
		 * 
		 * Entrada					Sa�da
		 * 	8						MUITO OBRIGADO
			1						Alcool: 1
			7						Gasolina: 2
			2						Diesel: 0
			2
			4
		 */

		Scanner sc = new Scanner(System.in);
		
		int tipoCombustivel;
		String nomeCombustivelAlcool = "";
		String nomeCombustivelGasolina = "";
		String nomeCombustivelDiesel = "";
		int contAlcool = 0;
		int contGasolina = 0;
		int contDiesel = 0;
		
		System.out.println("Informe um tipo de combust�vel");
		tipoCombustivel = sc.nextInt();
		
		while(tipoCombustivel != 4) {
			
			switch (tipoCombustivel) {
			case 1:
				nomeCombustivelAlcool = "�lcool";
				contAlcool++;
				break;
			case 2:
				nomeCombustivelGasolina = "Gasolina";
				contGasolina++;
				break;
			case 3:
				nomeCombustivelDiesel = "Diesel";
				contDiesel++;
				break;
			default:
				break;
			}
			
			System.out.println("Informe um tipo de combust�vel");
			tipoCombustivel = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println(nomeCombustivelAlcool + ": " + contAlcool);
		System.out.println(nomeCombustivelGasolina + ": " + contGasolina);
		System.out.println(nomeCombustivelDiesel + ": " + contDiesel);
		
		sc.close();
	}

}
