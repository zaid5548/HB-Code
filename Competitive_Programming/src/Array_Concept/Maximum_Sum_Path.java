package Array_Concept;

import java.util.Scanner;

public class Maximum_Sum_Path {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=scn.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr2[i]=scn.nextInt();
		}
		
		MaximumSumPath(arr1,arr2);
		
		t--;
	}

	}

	private static void MaximumSumPath(int[] one, int[] two) {
		
		int sum1=0;
		int sum2=0;
		int sum=0;
		int i=0,j=0;
		while(i<one.length && j<two.length) {
			
			if(one[i]<two[j]) {
				sum1=sum1+one[i];
				i++;
			}else if(one[i]>two[j]){
				sum2=sum2+two[j];
				j++;
			}else{
				sum+=Math.max(sum1, sum2)+one[i];
				i++;
				j++;
				sum1=0;
				sum2=0;
			}
			
		}
		while(i<one.length) {
			sum1+=one[i];
			i++;
		}
		while(j<two.length) {
			sum1+=two[j];
			j++;
		}
		
		sum+=Math.max(sum1, sum2);
		System.out.println(sum);
		
	}

}
