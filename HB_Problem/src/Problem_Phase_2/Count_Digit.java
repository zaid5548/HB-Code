package Problem_Phase_2;

import java.util.Scanner;

public class Count_Digit {

	 public static void main(String args[]) {
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();
			int m=scn.nextInt();
			countDigit(n,m);
	    }
		public static void countDigit(int n,int m){
			int node=nodeCount(n);
			int cnt=0;
			int[] arr=new int[node];
			int t=0;
			while(n>0){
				int temp=n%10;
				arr[cnt++]=temp;
				n/=10;
			}
			for(int i=0;i<arr.length;i++){
				if(arr[i]==m){
					t++;
				}
			}
			System.out.println(t);
		}
		public static int nodeCount(int n){
			int cnt=0;
			while(n>0){
				cnt++;
				n/=10;
			}
			return cnt;
		}
	
}
