package main;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		int a =0;
		int b = 0;
		int resultado =0;
		
		Scanner resultado1 = new Scanner( System.in);
		System.out.println("Entroduza os numeros: ");
		a = resultado1.nextInt();
		b = resultado1.nextInt();
		resultado = a + b;
		
		System.out.println("a soma de a e b é: " + resultado);

	}
}


