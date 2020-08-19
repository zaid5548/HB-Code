package Problem_Phase_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Virat_play_Factorial {

	static Scanner scn=new Scanner(System.in);
	  public static BigInteger factorial(BigInteger n) {
	    	BigInteger result = BigInteger.ONE;

	    	while (!n.equals(BigInteger.ZERO)) {
	       		result = result.multiply(n);
	        	n = n.subtract(BigInteger.ONE);
	    	}
	    	return result;
	    }
	  
	    public static void main(String args[]) throws Exception 
	    { 
	        BigInteger N = scn.nextBigInteger(); 
	        System.out.println(factorial(N)); 
	    } 
	
}
