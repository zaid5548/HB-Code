package Problem_Phase_2;

import java.util.Scanner;

public class Nth_Triangle_Recursion {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans=triangle(n,0);
		System.out.println(ans);
	}

	private static int triangle(int n,int sum) {
		if(n==1){
            return 1;
        }
   
        sum += n+triangle(n-1,sum);;
   
        
         return sum;
	}

}
