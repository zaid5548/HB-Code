package BackTracking_Approch;

public class Coin_Change {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,6};
//		coinchangeCombination(arr, 10, "", 0);
		coinchangePermutation(arr, 10, "");
	}
	
	public static void coinchangeCombination(int[] denom,int amount,String ans,int LastDenomIdx)
	{
		if(amount==0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=LastDenomIdx;i<denom.length;i++)
		{
			if(amount>=denom[i])
			{
				coinchangeCombination(denom, amount-denom[i], ans+denom[i], i);
			}	
		}
	}
	
	public static void coinchangePermutation(int[] denom,int amount,String ans)
	{
		if(amount==0)
		{
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		for(int i=0;i<denom.length;i++)
		{
			if(amount>=denom[i])
			{
				coinchangePermutation(denom, amount-denom[i], ans+denom[i]);
			}	
		}
	}
}
