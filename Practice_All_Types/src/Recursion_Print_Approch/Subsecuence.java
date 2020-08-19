package Recursion_Print_Approch;

public class Subsecuence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequence("abcd", "");
	}
	
	public static void subsequence(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		subsequence(ros, ans);
		subsequence(ros, ans+ch);
	}
}
