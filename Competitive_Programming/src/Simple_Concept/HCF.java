package Simple_Concept;

import java.util.Scanner;

public class HCF {

	public static void main(String arg[]) {
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int[] arr=new int[n1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int res=arr[0];
		for(int i=1;i<arr.length;i++) {
			res=HCF1(res,arr[i]);
		}
		System.out.println(res);
    }
	public static int HCF1(int a,int b){
		while (b > 0)
	    {
	        long temp = b;
	        b = a % b; 
	        a = (int) temp;
	    }
	    return a;
	   }
}
