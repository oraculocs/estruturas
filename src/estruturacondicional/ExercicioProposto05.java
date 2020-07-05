package estruturacondicional;

import java.util.Scanner;

public class ExercicioProposto05 {

	public static void main(String[] args) {
		
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o 
		 * c�digo de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * CODIGO			ESPECIFICA��O			PRE�O
		 * 1				Cachorro Quente			R$ 4.00
		 * 2				X-Salada				R$ 4.50
		 * 3				X-Bacon					R$ 5.00
		 * 4				Torrada Simples			R$ 2.00
		 * 5				Refrigerante			R$ 1.50
		 */

		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		double preco;
		double total = 0.;
		String nomeProduto = "";
		
		System.out.println("Digite o c�digo do Produto:");
		codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade de Produtos:");
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			preco = 4.00;
			nomeProduto = "Cachorro Quente";
			total = preco * quantidade;
		}else if(codigo == 2) {
			preco = 4.50;
			nomeProduto = "X-Salada";
			total = preco * quantidade;
		}else if(codigo == 3) {
			preco = 5.00;
			nomeProduto = "X-Bacon";
			total = preco * quantidade;
		}else if(codigo == 4) {
			preco = 2.00;
			nomeProduto = "Torrada simples";
			total = preco * quantidade;
		}else if(codigo == 5) {
			preco = 1.50;
			nomeProduto = "Refrigerante";
			total = preco * quantidade;
		}
		
		System.out.println("C�digo do Produto: " + codigo);
		System.out.println("Nome do Produto: " + nomeProduto);
		System.out.println("Quantidade: " + quantidade);
		System.out.printf("Total: R$ %.2f%n", total);
		
		
		sc.close();
		
	}

}
