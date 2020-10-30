package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		String [] name = new String[100];
		String [] tel = new String[100];
		int n = 0; //사람숫자
		
		Scanner inFile;
		try {
			inFile = new Scanner(new File("input.txt"));
			while(inFile.hasNext()) {
				//detect eof 
				name[n] =inFile.next();
				tel[n] = inFile.next();
				n++;
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(9);
		}
		
	}

}
