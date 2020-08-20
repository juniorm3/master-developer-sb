package logica.array.sort;

public class Main {

	public static void main(String[] args) {

		int[] valores = { 10, 6, 5, 2, 1, 4, 0, 7, 9, 8, 3 };

		for (int i = 0; i < valores.length - 1; i++) {
			for (int j = i + 1; j < valores.length; j++) {
				System.out.println("Valor de i = " + i + " - " + valores[i] + " > " + valores[j] + " ? = " + (valores[i] > valores[j] ? "Inverte" : "Mantem"));
				if (valores[i] > valores[j]) {
					int aux = valores[i];
					valores[i] = valores[j];
					valores[j] = aux;
				}
			}
		}

		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
	}

}
