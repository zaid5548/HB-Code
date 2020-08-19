package Problem_Phase_2;

import java.util.Scanner;

public class Strange_Road {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x2=scn.nextInt();
		int y2=scn.nextInt();
		int ans=strangeRoad(0,0,x2,y2);
		System.out.println(ans);
	}

	private static int strangeRoad(int x1, int y1,int x2,int y2) {
		int cnt=0;
		while(x1!=x2 && y1!=y2) {
			
			if(x1==y1) {
				x1+=1;
				cnt++;
//				y1=y1;
			}else if(x1>y1) {
				y1+=1;
				cnt++;
			}else if(x1==y1 && x1>1) {
				x1+=-2;
				cnt++;
			}else if(x1<y1) {
				y1+=-2;
				cnt++;
			}
			
		}
		
		return cnt;
	}

}
