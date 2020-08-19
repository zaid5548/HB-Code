package Problem_Phase_2;

import java.util.Scanner;

public class Lights_New_Car {
	
	static int mod=1000000007;
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-- >0) {
			
			String a=scn.nextLine();
			String b=scn.nextLine();
			
//			String To Integer
			int x=stringToInteger(a,mod);
			int y=stringToInteger(b,mod-1);
			
//			Power x^y
			int ans=power(x,y,mod);
			System.out.println(ans);
		}

	}

	private static int power(int x, int y, int m) {
//		base
		if(y==0)
			return 1;
		
//		recursive x^y/2
		int smallpow=(int) Math.pow(x, y/2);
		smallpow%=m;
		
		smallpow=(smallpow*smallpow)%m;
		if(y%2!=0) {
			return x*smallpow;
		}
		
		return smallpow;
	}

	private static int stringToInteger(String a, int m) {
		int ans=0;
		for(int i=0;i<a.length();i++) {
			int num=a.charAt(i);
			ans	=(ans*10)%m+num-'0';
			ans%=m;
		}
		return ans;
	}

}
