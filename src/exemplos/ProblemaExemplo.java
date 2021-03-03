package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {
		
		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que 
		 * dá direito a 100 minutos de telefone. Cada minuto que exceder a 
		 * franquia de 100 minutos custa R$ 2.00. Fazer um programa para
		 * ler a quantidade de minutos que uma pessoa consumiu, daí mostrar
		 * o valor a ser pago.
		 */	

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdMinutos;
		double conta = 50.0;
		
		System.out.println("Informe a Quantidade de Minutos?");
		qtdMinutos = sc.nextInt();
		
		if(qtdMinutos > 100) {
			conta += (qtdMinutos - 100) * 2.0;
			
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}

}
