package Practice;

import java.util.Scanner;

public class String_String_Compression {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		String str=d.nextLine();
		char[] ch=str.toCharArray();
		int n=ch.length;
		System.out.println(String_Compression(ch));
	}
	public static String String_Compression(char[] ch)
	{
		int cnt=0;
		String str = "";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					str+=ch[i]+cnt;
				}
			}
		}
		return str;
	}

}
