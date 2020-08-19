package Recursion_Print_Approch;

public class SubsequenceWithAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequencewithAscii("abc", "");
	}
	
	
	public static void subsequencewithAscii(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		subsequencewithAscii(ros, ans);
		subsequencewithAscii(ros, ans+ch);
		subsequencewithAscii(ros,ans+(int)ch);
	}
}
