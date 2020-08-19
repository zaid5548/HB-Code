package Problem_Phase_1;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0) {
			
			int c1=scn.nextInt();
			int c2=scn.nextInt();
			int c3=scn.nextInt();
			int c4=scn.nextInt();
			int n=scn.nextInt();
			int m=scn.nextInt();
			int[] rikshaw=new int[n];
			int[] cabs=new int[m];
			for(int i=0;i<n;i++) {
				rikshaw[i]=scn.nextInt();
			}
			for(int i=0;i<m;i++) {
				cabs[i]=scn.nextInt();
			}
			int TotalCostRikshaw=cost(rikshaw,c1,c2,c3);
			
			
			int TotalCostCabs=cost(cabs,c1,c2,c3);
			

			
//			int TotalCost=0;
//			TotalCost=Math.min((TotalCostRikshaw+TotalCostCabs), c4);
			
			System.out.println(Math.min((TotalCostRikshaw+TotalCostCabs), c4));
			t--;
		}

	}

	

	private static int cost(int[] arr,int c1,int c2,int c3) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			res+=Math.min(c1*arr[i],c2);
		}
		return Math.min(res, c3);
	}


}
