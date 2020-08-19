package Array_Problem;

import java.util.Scanner;

public class Form_Biggest_Number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		biggestNumber(arr);
		
		for(int val:arr) {
			System.out.print(val);
		}
		System.out.println();
		
		t--;
		}
	}

	private static void biggestNumber(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(compare(arr[j],arr[j+1])==false) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

	public static boolean compare(int n1,int n2) {
		String ans1=""+n1+n2;
		String ans2=""+n2+n1;
		int ans=ans1.compareTo(ans2);
		if(ans<0) {
			return false;
		}else {
			return true;
		}
	}

}
