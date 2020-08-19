package Number_System;

import java.util.Scanner;

public class Any_To_Any {
	
//	Approach  ----- 1
	
	 public static void main(String args[]) {
	        Scanner scn=new Scanner(System.in);
	        int sb=scn.nextInt();
	        int db=scn.nextInt();
	        int snum=scn.nextInt();
	        int dec=AnyToDecimal(snum,sb);
	        int res=DecimalToAny(dec,db);
	        System.out.print(res);
	    }
	        public static int AnyToDecimal(int snum, int sb)
	        {
	        int ans=0,multiplier=1;
	        while(snum!=0)
	        {
	           int rem=snum%10;
	            ans=ans+(rem*multiplier);
	            multiplier=multiplier*sb;
	            snum=snum/10;
	        }
	            return ans;
	        }
	        public static int DecimalToAny(int dec, int db)
	        {
	        int ans1=0,multiplier=1;
	        while(dec!=0)
	        {
	           int rem=dec%db;
	            ans1=ans1+(rem*multiplier);
	            multiplier=multiplier*10;
	            dec=dec/db;
	        }
	            return ans1;
	        } 
	
	
	
//	Approach ------2
	
//
//	public static void main(String[] args) {
//		
//		Scanner s=new Scanner(System.in);
//			
//		int ans=0;
//		int mul=1;
//		
//		int sb=s.nextInt();
//		int db=s.nextInt();
//		int val=s.nextInt();
//		while(val!=0) {
//			int temp=val%10;
//			
//			ans=ans+temp*mul;
//			val=val/10;
//			mul=mul*sb;
//			
//		}
//		convert(ans,db);
//
//	}
//
//	private static void convert(int ans,int db) {
//		int res=0;
//		int m=1;
//		while(ans!=0) {
//			int temp=ans%db;
//			
//			res=res+temp*m;
//			ans=ans/db;
//			m=m*10;
//			
//		}
//		
//		System.out.println(" Number is "+res);		
//	}
//	
}
