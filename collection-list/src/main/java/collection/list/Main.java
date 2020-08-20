package collection.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> listaMercado =  new LinkedList<>(); //new ArrayList<>();
		listaMercado.add("macarrão");
		listaMercado.add("feijão");
		listaMercado.add("ovo");
		listaMercado.add("sal");
		
		Collections.sort(listaMercado);
		
		System.out.println(listaMercado);
		
		for (String item : listaMercado) {
			System.out.println(item);
		}
		
		System.out.println("");
		
		for (int i = 0; i < listaMercado.size(); i++) {
			System.out.println("Item => " + listaMercado.get(i));
		}
		
		listaMercado.remove(0);
		System.out.println(listaMercado);
		
		listaMercado.remove("ovo");
		System.out.println(listaMercado);
		
		
		System.out.println(listaMercado.contains("sal"));
		System.out.println(listaMercado.contains("farinha"));
		
		int posSal = listaMercado.indexOf("sal");
		System.out.println("Posição do sal: " + posSal);
		
		int posFarinha = listaMercado.indexOf("farinha");
		System.out.println("Posição do sal: " + posFarinha);
		
	}

}
