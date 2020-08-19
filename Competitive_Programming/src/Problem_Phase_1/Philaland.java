package Problem_Phase_1;

import java.util.Scanner;

public class Philaland {

	public static void main(String arg[]){
	  	
	    Scanner scn=new Scanner(System.in);
	    
	    int T=scn.nextInt();
	    while(T>0){
	    	
	    	int n=scn.nextInt();
	      	int i=1,sum=0,count=0;
	      	while(sum<n){
	        
	        	sum=sum+i;
	          	i++;
	          	count++;
	          	
	        }
	      
	      System.out.println(count);
	      T--;
	    }
	
	}
}
