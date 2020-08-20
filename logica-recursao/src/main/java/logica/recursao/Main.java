package logica.recursao;

public class Main {

	public static void main(String[] args) {

		int resposta = fatorial(6);
		
		System.out.println("O fatorial é: " + resposta);
	}

	static int fatorial(int n) {

		if (n == 0) {
			return 1;
		}

		return n * fatorial(n - 1);
	}

}
