package inflearn;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {

		String str = "Hello";
		String input = null;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type a string: ");
		input = kb.next();
		if(str.equals(input)) {
			System.out.println("String match");
		} else {
			System.out.println("Strings do not match");
		}
		kb.close();	
	}

}