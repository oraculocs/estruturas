package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que peça o tamanho de um arquivo para download (em MB) 
		 * e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo 
		 * aproximado de download do arquivo usando este link (em minutos).
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double tamanhoArquivo;
		Double velLink;
		Double minutos;
		
		System.out.println("Informe o tamanho do arquivo de download: ");
		tamanhoArquivo = sc.nextDouble();
		
		System.out.println("Informe a Velocidade do Link: ");
		velLink = sc.nextDouble();
		
		minutos = tamanhoArquivo / velLink;
		
		System.out.println("O tempo aproximado do download é de: " + minutos + " minutos");
		
		
		sc.close();
	}

}
