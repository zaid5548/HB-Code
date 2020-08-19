package Simple_Concept;

//import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		printArmstrong(1,1000);
	}
	public static void printArmstrong(int lo,int hi) {
		for(int i=lo;i<=hi;i++) {
			boolean ans= isArmstrongNumber(i);
			if(ans) {
				System.out.print(i+" ");
			}
		
	
		}
	}

	public static boolean isArmstrongNumber(int n) {
		int d=digit(n);
		int ans=0;
		int t=n;
		while(n>0) {
			int temp=n%10;
			ans=ans+(int)Math.pow(temp, d);
			n=n/10;
		}
		
		if(ans==t) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public static int digit(int num) {
		int cnt=0;
		
		while(num>0) {
			cnt++;
			num=num/10;
		}
			
			return cnt;
		
	}

}
