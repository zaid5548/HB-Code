package Simple_Concept;

import java.util.Scanner;

public class Inverse_Number {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Any Number");
		int n=scn.nextInt();
		reverse(n);

	}
	
	public static void reverse(int n) {
		
		int cnt=0;
		int ans=0;
		while(n!=0) {
			
			int temp=n%10;
			cnt++;
			ans+=cnt*(int)Math.pow(10, temp-1);
			n=n/10;
			
		}
		System.out.println(ans);
	}

}
