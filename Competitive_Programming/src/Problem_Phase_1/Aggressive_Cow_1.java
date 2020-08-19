package Problem_Phase_1;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cow_1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int nos = scn.nextInt();

		int noc = scn.nextInt();

		int[] stalls = new int[nos];
		for (int i = 0; i < nos; i++) {
			stalls[i] = scn.nextInt();
		}
		Arrays.sort(stalls);
		int lo=0;
		int hi=stalls[nos-1]-stalls[0];
		int ans=0;
		while(lo<=hi) {
			
			int mid=lo+(hi-lo)/2;
			if(IsItPossible(stalls,mid,noc)) {
				ans=mid;
				lo=mid+1;
			}else {
				hi=mid-1;
			}
			
		}
		System.out.println(ans);

	}

	private static boolean IsItPossible(int[] stalls, int mid, int noc) {
		
		int cowplaced=1;
		int lastplaced=stalls[0];
		
		for(int i=1;i<stalls.length;i++) {
			if(stalls[i]-lastplaced>=mid) {
				cowplaced++;
				lastplaced=stalls[i];
			}
			
			if(cowplaced>=noc) {
				return true;
			}
		}
		
		return false;
	}

}
