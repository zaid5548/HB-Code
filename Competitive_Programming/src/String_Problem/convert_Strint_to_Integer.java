package String_Problem;

import java.util.Scanner;

public class convert_Strint_to_Integer {

	  static int stringToInt(String str) 
	    { 
	  
	        if (str.length() == 1) 
	            return (str.charAt(0) - '0'); 
	  
	        double y = stringToInt(str.substring(1)); 
	  
	        double x = str.charAt(0) - '0'; 
	   
	        x = x * Math.pow(10, str.length() - 1) + y; 
	        return (int)(x); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	    	Scanner scn=new Scanner(System.in);
	    	String str=scn.nextLine();
	        System.out.print(stringToInt(str)); 
	    } 

}
