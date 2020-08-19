package Simple_Concept;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		Reverse(num);
	}

	public static void Reverse(int num) {
		int ans=0;
		while(num>0) {
			int temp=num%10;
			ans=ans*10+temp;
			num=num/10;
		}
		System.out.print("Reverse number is "+ans);
	}
}
