package section2;

import java.util.Scanner;

public class Code06 {

	static Polynomial [] polys = new Polynomial[100];
	static int n = 0;



	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		while(true) {
			String command = kb.next();
			if(command.equals("create")) {
				char name =kb.next().charAt(0);
				Polynomial p = new Polynomial();
				p.name = name;
				p.nterms = 0;
				
				polys[n] = p;
				n++;
			}
			else if(command.equals("add")) {
				char name = kb.next().charAt(0);
				int index = find(name);
			}
			else if(command.equals("clac")) {

			}
			else if(command.equals("print")) {

			}
			else if(command.equals("exit")) {
				break;
			}
		
		}


		kb.close();

	}



	private static int find(char name) {
		for (int i=0; i<n; i++) {
			if(polys[i].name == name)
				return i;
		}
		return -1;
	}

}
