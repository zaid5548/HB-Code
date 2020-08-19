package Problem_Phase_2;

import java.util.Scanner;

public class Sum_Of_Odd_Placed_And_Even_Places_Digit {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		long num=scn.nextLong();
		SumOddEven(num);

	}

	private static void SumOddEven(long num) {
		int cnt=0;
		int oddSum=0;
		int evenSum=0;
		int node=nodeNum(num);
		int[] arr=new int[node];
		while(num>0) {
			int temp=(int) (num%10);
			arr[cnt++]=temp;
			num/=10;
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				evenSum+=arr[i];
			}else {
				oddSum+=arr[i];
			}
		}
		System.out.println(oddSum);
		System.out.println(evenSum);
		
	}

	private static int nodeNum(long num) {
		int cnt=0;
		while(num>0) {
			cnt++;
			num/=10;
		}
		return cnt;
	}

}
