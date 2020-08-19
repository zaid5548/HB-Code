package Simple_Concept;

import java.util.Scanner;

public class Celsius_Conversion {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int min=scn.nextInt();
		int max=scn.nextInt();
		int step=scn.nextInt();
		for(int i=min;i<=max;i+=20) {
			int c=(int)((5.0/9)*(i-32));
			System.out.println(i+" "+c);
		}

	}

}
