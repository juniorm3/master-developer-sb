package logica.fibonacci;

public class Main {

	public static void main(String[] args) {

		int vezes = 10;

		for (int count = 0, i = 0, j = 1; count < vezes; count++) {
			System.out.print(i + " ");
			
			i = i + j;
			j = i - j;
		}
	}

}
