package Simple_Concept;

import java.util.Scanner;

public class NextLarger_Number {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		nextlarger(n);
		
	}
	
	public static void nextlarger(int n) {
		
		while(n>0) {
			
			int t1=n%10;
			n=n/10;
			int t2=n%10;
			
			if(t1>t2) {
				
				int temp=t1;
				t1=t2;
				t2=temp;
				
			}
			else {
				
				
				
			}
			
		}
		
	}
	
}
