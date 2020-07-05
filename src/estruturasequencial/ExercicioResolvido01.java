package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {

		//largura, comprimento, valorMetroQuadrado
		//Mostrar o valorArea, valorPreco
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura;
		double comprimento;
		double valorMetroQuadrado;
		double area;
		double preco;
		
		System.out.println("Digite um valor para largura: ");
		largura = sc.nextDouble();
		
		System.out.println("Digite um valor para o comprimento: ");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do Metro Quadrado: ");
		valorMetroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * valorMetroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		sc.close();
	}

}
