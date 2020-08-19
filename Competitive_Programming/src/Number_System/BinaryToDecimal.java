package Number_System;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Binary value");
			int val=s.nextInt();
				
			int ans=0;
			int mul=1;
			
			while(val!=0) {
				int temp=val%10;
				
				ans=ans+temp*mul;
				val=val/10;
				mul=mul*2;
				
			}
			
			System.out.println("Decimal Number is "+ans);
	
		}
	
}
