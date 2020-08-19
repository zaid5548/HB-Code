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
			
			int costRik=findCost(c1,c2,rikshaw);
			int totalRikshaeCost=Math.min(costRik, c3);
			
			int costcab=findCost(c1,c2,cabs);
			int totalCabsCost=Math.min(costcab, c3);
			
			int fanalTotalCost=Math.min(totalRikshaeCost+totalCabsCost, c4);
			System.out.println(fanalTotalCost);
			t--;
		}
	}

	private static int findCost(int c1, int c2, int[] rikshaw) {
		int minCost=0;
		for(int i=0;i<rikshaw.length;i++) {
			minCost+=Math.min(rikshaw[i]*c1, c2);
		}
		
		return minCost;
	}

	

}
