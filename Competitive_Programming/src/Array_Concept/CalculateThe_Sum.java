package Array_Concept;

import java.util.Scanner;

public class CalculateThe_Sum {

// Program is Wrong Please Try Again  Date- 13/07/2020 Time- 1:22PM	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int q=scn.nextInt();
		int sum=0;
	
			for(int i=0;i<n;i++) {
				sum+=arr[i]%(int)Math.pow(10, 9)+7;
			}
		
		sum+=(int)Math.pow(2, q)*sum;
		
		System.out.println(sum);

	}

}
