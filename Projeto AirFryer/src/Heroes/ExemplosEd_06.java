package Heroes;

import java.util.Scanner;

public class ExemplosEd_06 {
	
	public static void main(String[]args) {
		Scanner par = new Scanner(System.in);
		
		int n = par.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O n�mero digitado � par");
		}
			else {
				System.out.println("O n�mero digitado � impar");
			}
		par.close();
		}
	}


