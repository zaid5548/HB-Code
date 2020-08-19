package Recursion_Print_Approch;

public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad("145", "");
	}

	public static void keypad(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		String code=getcode(ch);
		for(int i=0;i<code.length();i++)
		{
			char c=code.charAt(i);
			keypad(ros, ans+c);
		}
		
	}
	
	public static String getcode(char ch)
	{
		if(ch=='1')
			return "abc";
		else if(ch=='2')
			return "def";
		else if(ch=='3')
			return "ghi";
		else if(ch=='4')
			return "jkl";
		else if(ch=='5')
			return "mno";
		else if(ch=='6')
			return "pqr";
		else if(ch=='7')
			return "stu";
		else if(ch=='8')
			return "vwx";
		else if(ch=='9')
			return "yz";
		else
			return "0";
	}
	
}
