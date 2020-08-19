package Simple_Concept;

import java.util.Scanner;

public class Rotate_Number {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scn.nextInt();
		int r=scn.nextInt();
		rotate(n,r);

	}

	private static void rotate(int n,int RotateNo) {

		//no of digit
		int num=n;
		int digit=0;
		while(num!=0) {
			num=num/10;
			digit++;
			
		}
		
		RotateNo=RotateNo%n;
		
			if(RotateNo<0) {
				RotateNo=RotateNo+n;
			}
		
		
		
		//solve to rotate
		int ans=0;
		for(int r=0;r<RotateNo;r++) {
		int temp=n%10;
		int part=n/10;
		ans=temp*(int)Math.pow(10, digit-1)+part;
		n=ans;
		}
		System.out.println(ans);
	}	
}
