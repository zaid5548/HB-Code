package Hacker_Rank;

import java.util.Scanner;

public class String_LexicoGraphy {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		String A=scn.nextLine();
		String B=scn.nextLine();
		boolean st=anagram(A, B);
		System.out.println((st)?"Anagrams":"Not Anagrams");
		String str="";
		int l1=A.length();
		int l2=B.length();
		System.out.println(l1+l2);
		/*if(A.equals(B))
		{
			System.out.println("No");
		}
		else if(A.length()==B.length())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}*/
		System.out.println(A.compareTo(B)>0?"Yes":"No");
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
		/*char ch1=A.charAt(0);
		String s=A.toUpperCase();
		str+=A+" "+B;
		System.out.println(convert(str));*/
	}

    /*static String convert(String str) 
    { 
  
        char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
  
            if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') { 
  
                if (ch[i] >= 'a' && ch[i] <= 'z') { 
  
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
  
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
  
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
  
        String st = new String(ch); 
        return st; 
    }*/
	public static boolean anagram(String a,String b)
	{
	 if(a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ) return false;
        return true;
	 }

}
