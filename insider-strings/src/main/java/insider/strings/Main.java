package insider.strings;

public class Main {

	public static void main(String[] args) {
		
//		String s1 = "abc";
//		String s2 = "abc";
//		System.out.println(s1);
//		System.out.println(s2);
		
		String s1 = "abc";
		String s2 = new String("abc");
		

		System.out.println(s1);
		System.out.println(s2);
		
		if(s1 == s2) {
			System.out.println("IGUAL");
		} else {
			System.out.println("DIFERENTE");
		}
		
		if(s1.equals(s2)) {
			System.out.println("IGUAL");
		} else {
			System.out.println("DIFERENTE");
		}
	}

}
