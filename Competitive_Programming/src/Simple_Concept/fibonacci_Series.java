package Simple_Concept;

import java.util.Scanner;

public class fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of term for fibonacci series ");
		int num=s.nextInt();
		fibonacciSeries(num);
	}
	
	public static void fibonacciSeries(int num) {
		int n1=0,n2=1;
		for(int i=0;i<num;i++) {
			if(i==0 || i==1) {
				 
				System.out.print(i+" ");
			}
			else {
				int temp=n1+n2;
				n1=n2;
				n2=temp;
				System.out.print(n2+" ");
			}
			
			
		}
	}

}
