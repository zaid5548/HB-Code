package Array_Concept;

import java.util.Scanner;

public class Book_Allocate {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int b = scn.nextInt();

		int s = scn.nextInt();

		int[] pages = new int[b];
		for (int i = 0; i < b; i++) {
			pages[i] = scn.nextInt();
		}


		int lo=0;
		int hi=0;
		for(int pag:pages) {
			hi+=pag;
		}
		
		hi=hi-lo;
		
		int ans=0;
		while(lo<=hi) {
			
			int mid=(lo+hi)/2;
			if(ItIsPossible(pages,mid,s)) {
				ans=mid;
				hi=mid-1;
			}else {
				lo=mid+1;
			}
			
		}
		System.out.println(ans);
		
	}

	private static boolean ItIsPossible(int[] pages, int mid, int s) {
		
		int student=1;
		int pageread=0;
		int curr_book=0;
		while(curr_book<pages.length) {
			
			if(pageread+pages[curr_book]<=mid) {
				pageread=pageread+pages[curr_book];
				curr_book++;
			}else {
				student++;
				pageread=0;
			}
			if(student>s) {
				return false;
			}
			
		}
		
		return true;
	}

}
