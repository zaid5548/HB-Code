package Problem_Phase_1;

import java.util.Scanner;

public class Alex_Shoping {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		int[] price=new int[n];
		for(int i=0;i<n;i++) {
			price[i]=scn.nextInt();
		}
		
		int q=scn.nextInt();
		while(q>0) {
			int money=scn.nextInt();
			int k=scn.nextInt();
			int cnt=0;
			for(int i=0;i<price.length;i++) {
				if(money%price[i]==0) {
					cnt++;
				}
			}
			if(cnt<k) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			
			q--;
		}
	}

}
