package Number_System;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal value");
		int val=s.nextInt();
			
		int ans=0;
		int multi=1;
		
		while(val!=0) {
			int temp=val%2;
			ans=ans+temp*multi;
			val=val/2;
			multi=multi*10;
		}
		
		System.out.println("Binary Number is "+ans);

	}

}
