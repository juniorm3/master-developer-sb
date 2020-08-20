package logica.metodo;

public class Main {

	public static void main(String[] args) {

		calcularFiboancci(2, ",");
		System.out.println();

		calcularFiboancci(5, "-");
		System.out.println();

		int[] valores = calcularFiboancci(10);
		
		for (int v : valores) {
			System.out.print(v + " - ");
		}
		
		System.out.println();
		System.out.println("Fim!");
	}

	static void calcularFiboancci(int vezes, String separador) {
//		int vezes = 10;
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + separador);

			i = i + j;
			j = i - j;

		}
	}

	static int[] calcularFiboancci(int vezes) {
		int[] resposta = new int[vezes];

		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			i = i + j;
			j = i - j;

			resposta[cont] = i;
		}

		return resposta;
	}

}
