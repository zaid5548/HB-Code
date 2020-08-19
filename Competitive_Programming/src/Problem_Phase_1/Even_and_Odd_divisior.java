package Problem_Phase_1;

import java.util.Scanner;
import java.math.*;
public class Even_and_Odd_divisior {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0){
			int n=scn.nextInt();
			int oddSum=0;
			int EvenSum=0;
			for(int i=1;i<=n;i++){
				if(i%2==0){
					if(n%i==0){
						EvenSum+=i;
					}
				}else{
					if(n%i==0){
						oddSum+=i;
					}
				}
			}
			
			int divisors=EvenSum-oddSum;
			System.out.println(divisors);
		}
    }
	
}
