package Recursion_Print_Approch;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("amr", "");
	}
	
	
	public static void permutation(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans+" ");
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			permutation(str.substring(0,i)+str.substring(i+1),ans+ch);
		}
		}
}
