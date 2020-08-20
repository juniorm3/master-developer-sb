package logica.decisaoif;

import br.com.softblue.commons.io.Console;

public class Main1 {

	public static void main(String[] args) {

		System.out.println("Digite sua idade:");
		int idade = Console.readInt();

		if (idade <= 12) {
			System.out.println("Você é CRIANÇA");

		} else {
			System.out.println("Você é ADULTO");
		}

		System.out.println("Fim do Programa!");

	}

}
