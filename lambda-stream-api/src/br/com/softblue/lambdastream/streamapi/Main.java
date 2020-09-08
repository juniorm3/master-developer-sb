package br.com.softblue.lambdastream.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<String> words = List.of("CARLOS", "JOSÉ", "JOÃO", "JOANA", "MARIA", "CELSO");
		
//		List<String> filtereWords = 
		words.stream()
			.filter(w -> w.startsWith("J"))
			.map(w -> w.toLowerCase())
			.forEach(w -> System.out.println(w));
//			.collect(Collectors.toList());
		
//		filtereWords.stream().forEach(w -> System.out.println(w));
//		filtereWords.forEach(w -> System.out.println(w));
//		System.out.println(filtereWords);
	}

}
