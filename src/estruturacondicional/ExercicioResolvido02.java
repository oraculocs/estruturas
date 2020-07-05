package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite um valor para (a)");
		a = sc.nextDouble();
		
		System.out.println("Digite um valor para (b)");
		b = sc.nextDouble();
		
		System.out.println("Digite um valor para (c)");
		c = sc.nextDouble();
		
		delta = (b * b) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2 * a); 
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		if(a <= 0 || delta <= 0) {
			System.out.println("Impossível calcular!");
		}else {
			System.out.printf("R1 = %.5f%n", x1);
			System.out.printf("R2 = %.5f%n", x2);
		}
		
		sc.close();
	}

	
	
}
