package Simple_Concept;

import java.util.Scanner;

public class Power_Two_Number {

	 public static void main(String args[]) {
			Scanner scn=new Scanner(System.in);
			int a=scn.nextInt();
			int b=scn.nextInt();
			pow(a,b);
			
	    }

	private static void pow(int a, int b) {
		
		int ans=0;
		ans=(int)Math.pow(a, b);
		System.out.println(ans);
	}
	
}
