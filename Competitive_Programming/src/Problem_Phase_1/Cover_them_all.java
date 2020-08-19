package Problem_Phase_1;

import java.util.Scanner;

public class Cover_them_all {
	
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		int ns=scn.nextInt();
		int sum=0;
		
		while(t>0){
			int[] arr1=new int[ns];
			int[] arr2=new int[ns];
			for(int i=0;i<ns;i++){
				arr1[i]=scn.nextInt();
			}
			for(int j=0;j<ns;j++) {
				arr2[j]=scn.nextInt();
			}
			
			
			for(int i=0;i<ns;i++) {
				for(int j=i;j<ns;j++) {
					sum+=Math.max(arr2[j], arr2[i])*Math.abs(arr1[i]-arr1[j]);
				}
			}
			System.out.println(sum);

			t--;
		}
    }
	
}
