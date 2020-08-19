package Problem_Phase_1;

import java.util.Scanner;

public class Majority_Elements {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no of element");
        int n=scn.nextInt();
        int m=n/3;
        int[] arr=new int[n];
        int[] ans=new int[n/3];
        for(int i=0;i<arr.length;i++){
             arr[i]=scn.nextInt();
        }
        
        int[] res;
        res=majorityElement(arr);
        if(res.length==0) {
        	System.out.println("assssssssss");
        }
        else {
        	for(int i=0;i<res.length;i++) {
        		System.out.print(res[i]+" ");
        	}
        }
	}
	
	private static int[] majorityElement(int[] arr) {
		
		int element1=arr[0];
		int count1=0;
				
		int element2=0;
		int count2=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(element1==arr[i]) {
				count1++;
			}
			else if(element2==arr[i]) {
				count1++;
			}
			else if(count1==0) {
				element1=arr[i];
			}
			else if(count2==0) {
				element2=arr[i];
			}
			else {
				count1--;
				count2--;
			}
		}
		
		count1=count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element1)
				count1++;
			else if(arr[i]==element2)
				count2++;
		}
		
		int[] ans=new int[arr.length/3];
		
		if(count1>arr.length/3)
			for(int i=0;i<ans.length;i++) {
				ans[i]=count1;
			}
			 
		if(count2>arr.length/3)
			for(int i=0;i<ans.length;i++) {
				ans[i]=count2;
			}
			
		
		return ans;
		
	}

	

}
