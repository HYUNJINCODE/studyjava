package inflearn;

import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		int number =123;
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter an integer:");
		int input  = kb.nextInt();
		if(input ==number) {
			System.out.println("Numbers match!");
		} else {
			System.out.println("numbers do not match");
		}
		kb.close();
	}
	
}
