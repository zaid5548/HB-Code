package Array_Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Sum_Of_Two_Array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scn.nextInt();
		}
		int m=scn.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=scn.nextInt();
		}
		arraySum(arr1, arr2);
	}
	 public static void arraySum(int[] one, int[] two) {

	        ArrayList ans = new ArrayList<>();

	        int i = one.length - 1;
	        int j = two.length - 1;

	        int carry = 0;
	        while (i >= 0 || j >= 0) {

	            int sum = carry;

	            if (i >= 0) {
	                sum += one[i];
	            }

	            if (j >= 0) {
	                sum += two[j];
	            }

	            int rem = sum % 10;
	            ans.add(0, rem);
	            carry = sum / 10;

	            i--;
	            j--;
	        }

	        if (carry != 0) {
	            ans.add(0, carry);
	        }

	        for (i = 0; i < ans.size(); i++) {
	            System.out.print(ans.get(i) + ", ");
	        }
	        System.out.println("END");
	 }
}
