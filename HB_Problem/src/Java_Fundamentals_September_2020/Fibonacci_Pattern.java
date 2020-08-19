package Java_Fundamentals_September_2020;

import java.util.Scanner;

public class Fibonacci_Pattern {

	 public static void main(String args[]) 
	    { 
	        Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
	        fibPattern(n); 
	    }
	    public static void fibonacci(int f[], int N) 
	    { 
	        
	        f[1] = 0; 
	        f[2] = 1; 
	          
	        for (int i = 3; i <= N; i++) 
	         
	            f[i] = f[i - 1] + f[i - 2]; 
	    } 
	      
	    public static void fibPattern(int n) 
	    { 
	        
	        int N = n * (n + 1) / 2; 
	        int f[]=new int[N + 1]; 
	        fibonacci(f, N); 
	          
	      
	        int fiboNum = 1; 
	      
	       
	        for (int i = 1; i <= n; i++) 
	        { 
	            
	            for (int j = 1; j <= i; j++) 
	                System.out.print(f[fiboNum++] + " "); 
	                  
	            System.out.println(); 
	        } 
	    } 

}
