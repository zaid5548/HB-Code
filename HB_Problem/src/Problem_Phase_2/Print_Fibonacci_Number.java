package Problem_Phase_2;

import java.util.Scanner;

public class Print_Fibonacci_Number {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		fibonacci(n);
    }
	public static void fibonacci(int n){

		int sum=0;
		int	t1=0,t2=0,t3=0;
		for(int i=0;i<n;i++){
			if(i==0){
				t1=i;
				System.out.println(t1);
			}
			else if(i==1){
				t2=i;
				System.out.println(t2);
			}
			else {
						t3=t1+t2;
						t1=t2;
						t2=t3;
						if(t3<=n)
						System.out.println(t3);
						else
							break;
			}
			
		}
		

	}
	
}
