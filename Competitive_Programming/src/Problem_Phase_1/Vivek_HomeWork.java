package Problem_Phase_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Vivek_HomeWork {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int m=1;
		
		int nm=0;
		for(int i=0;i<arr.length;i++) {
			m*=arr[i];
		}
		int fn=0;
		for(int i=0;i<arr.length;i++) {
			nm=(int) Math.pow(arr[i], n);
			if(nm>m) {
				fn=arr[i];
				break;
			}
		}
		System.out.println(fn);
	}

}
