package Problem_Phase_1;

import java.util.Scanner;

public class Chewbacca_Number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long num=scn.nextLong();
		int i=0;
		long ans=0;
		while(num>0) {
			long temp=num%10;
			if(temp>9-temp) {
				if(temp<=10 && temp==9) {
					temp=temp;
				}else {
					temp=9-temp;
				}
			}
			ans=ans+temp*(long)Math.pow(10, i);
			i++;
			num/=10;
		}
		System.out.println(ans);

	}

}
