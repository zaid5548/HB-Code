package Problem_Phase_2;

import java.util.Scanner;

public class Max_Length_Bitonic_Subsequence {
	static int lbs( int arr[], int n ) 
    { 
        int i, j; 
 
        int[] lis = new int[n]; 
        for (i = 0; i < n; i++) 
            lis[i] = 1; 
  
        //left to roght
        for (i = 1; i < n; i++) 
            for (j = 0; j < i; j++) 
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) 
                    lis[i] = lis[j] + 1; 
  
        int[] lds = new int [n]; 
        for (i = 0; i < n; i++) 
            lds[i] = 1; 
  
        
        //right to left
        for (i = n-2; i >= 0; i--) 
            for (j = n-1; j > i; j--) 
                if (arr[i] > arr[j] && lds[i] < lds[j] + 1) 
                    lds[i] = lds[j] + 1; 
  
        int max = lis[0] + lds[0] - 1; 
        for (i = 1; i < n; i++) 
            if (lis[i] + lds[i] - 1 > max) 
                max = lis[i] + lds[i] - 1; 
  
        return max; 
    } 
  
    public static void main (String[] args) 
    { 
        Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0){
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
        System.out.println(lbs( arr, n )); 
		t--;
		}
    } 
	
}
