package Problem_Phase_1;

import java.util.Scanner;

public class Fahrenheit_To_Celsies {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int min=scn.nextInt();
		int max=scn.nextInt();
		int jump=scn.nextInt();
		int i=min;
		while(i<=max) {
			fajrenheitToCelsies(i);
			
			i+=jump;
		}
	}

	private static void fajrenheitToCelsies(int n) {
		int ans=(int)((5.0/9)*(n-32));
		System.out.print(n+" "+ans);
		System.out.println();
	}

}
