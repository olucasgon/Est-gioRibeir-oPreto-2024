package testes;

import java.util.Scanner;

public class teste5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		String text;
		
		System.out.println("Digite sua String/Palavra: ");
		text = sc.nextLine();
		
		String invert = "";
		for (int i = text.length() -1; i >= 0; i--) {
			invert += text.charAt(i);
		}
		
		System.out.println("Sua String/Palavra ivertida é : " + invert);
		
		sc.close();
	}

}
