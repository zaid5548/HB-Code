package Backtracking_Approach;

public class Target_Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins= {2,3,4,6};
//		targetcoins(coins, 10, "", 0);
		int cnt=targetcoinsCount(coins,10,"",0);
		System.out.println("\n"+cnt);
//		Coins_Change_Box_Respect(coins, 0, 10, "");
	}
		
	public static void targetcoins(int[] coins,int target,String ans,int LastIndex) {
		
		if(target==0) {
			System.out.print(ans+" ");
			return;
		}
		
		if(target<0) {
			return;
		}
		
		for(int i=LastIndex;i<coins.length;i++) {
			
			targetcoins(coins, target-coins[i], ans+coins[i],i);
			
		}
		
	}
	
	
	public static int targetcoinsCount(int[] coins,int target,String ans,int LastIndex) {
		
		if(target==0) {
			System.out.print(ans+" ");
			return 1;
		}
		
		if(target<0) {
			return 0;
		}
		
		int cnt=0;
		for(int i=LastIndex;i<coins.length;i++) {
			
			cnt+=targetcoinsCount(coins, target-coins[i], ans+coins[i],i);
			
		}
		
		return cnt;
		
	}


	public static void Coins_Change_Box_Respect(int[] coins,int vidx,int target,String ans) {
		
		if(target==0) {
			System.out.print(ans+" ");
			return;
		}
		
		if(target<0) {
			return;
		}
		
		if(vidx>=coins.length) {
			return;
		}
		
		Coins_Change_Box_Respect(coins, vidx, target-coins[vidx], ans+coins[vidx]);
		
		Coins_Change_Box_Respect(coins, vidx+1, target, ans);
	}
	
}
