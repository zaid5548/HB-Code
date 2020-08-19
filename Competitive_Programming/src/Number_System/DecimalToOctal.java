package Number_System;

import java.util.Scanner;

public class DecimalToOctal {

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Decimal value");
		int val=s.nextInt();
			
		int ans=0;
		int mul=1;
		
		while(val!=0) {
			int temp=val%8;
			
			ans=ans+temp*mul;
			val=val/8;
			mul=mul*10;
			
		}
		
		System.out.println("Octal Number is "+ans);

	}
	
}
