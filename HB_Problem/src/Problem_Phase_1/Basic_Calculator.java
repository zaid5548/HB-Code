package Problem_Phase_1;

import java.util.Scanner;

public class Basic_Calculator {

	public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
	 while(true) {
		char ch=scn.next().charAt(0);
		if(ch=='+'||ch=='-'||ch=='*'||ch=='%'||ch=='/')
		{
			int n1=scn.nextInt();
			int n2=scn.nextInt();
			int ans=0;
			if(ch=='+')
			{
				ans=n1+n2;
			}
			else if(ch=='-')
			{
				ans=n1-n2;
			}
			else if(ch=='*')
			{
				ans=n1*n2;
			}
			else if(ch=='/')
			{
				ans=n1/n2;
			}
			else {
				ans=n1%n2;
			}
			System.out.println(ans);
		}
		else if(ch=='x'||ch=='X')
		{
			break;
		}
		else
		{
			System.out.println("Invalid operation. Try again.");
		}
		
	 }

    }

}
