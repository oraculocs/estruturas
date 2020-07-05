package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {

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
