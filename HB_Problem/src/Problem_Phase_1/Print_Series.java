package Problem_Phase_1;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int cnt=1;
		int i=n1;
		while(i>0) {
			int ans=3*cnt+2;
			if(ans%n2==0) {
				cnt++;
				i++;
			}else {
				cnt++;
				System.out.println(ans);
			}
			i--;
		}
		

	}

}
