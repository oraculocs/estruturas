package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto06 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C.
		 * Em seguida, calcule e mostre:
		 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		 * b) a �rea do c�rculo de raio C. (pi = 3.14159)
		 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
		 * d) a �rea do quadrado que tem lado B.
		 * e) a �rea do ret�ngulo que tem lados A e B.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C;
		double areaTR;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		double PI = 3.14159;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();

		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		areaTR = (A * C) / 2;
		areaCirculo = PI * (C * C);
		areaTrapezio = ((A + B) * C) / 2;
		areaQuadrado = B * B;
		areaRetangulo = A * B; 
		
		System.out.printf("TRIANGULO: %.3f%n", areaTR);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
