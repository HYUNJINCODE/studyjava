package inflearn;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		int [] data = new int[n];
		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
			
		}
		kb.close();
		
		int max =0;
		for (int i=0; i<n; i++) {
			for(int j=i; j<n; i++) {
				int sum = 0;
				for(int k=i; k<=j; k++) {
					sum+=data[k];
				}
				if(sum>max)
					max=sum;
			}
		}
		System.out.println(max);
	}

}
