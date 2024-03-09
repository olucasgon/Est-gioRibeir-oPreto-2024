package testes;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num ;
		
		System.out.print("Olá! Informe o número para verificar se pertence à sequência de Fibonacci:\nDigite aqui: ");
		num = sc.nextInt();
		
		int max = num;
		boolean teste = false;
		int a = 0;
		int b = 1;

		
		while (a <= max) {
			if (a == num) {
				teste = true;
				break;
			}
			int temp = a;
			a = b;
			b = temp + b;
		}

		if (teste) {
			System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
		}
		
		sc.close();
	}
}
