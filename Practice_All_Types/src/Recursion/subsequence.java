package Recursion;

import java.util.ArrayList;

public class subsequence {

	public static void main(String[] args) {
		
		Subseq("dcba", "");
//		System.out.println(subseq("abc"));
//		System.out.println(subseqwithAscii("ba"));
//		int val=0;
//		SubseqWithAscii("abcde","");
//		System.out.println(val);
//		String str="abc";
//		String st="";
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			st+=str.charAt(i);
//		}
//		System.out.println(subseq2(st));
//		printSubSeq(str);
	}

	public static ArrayList<String> subseq(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=subseq(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String val:rr)
		{
			
			mr.add(val);
			mr.add(ch+val);
		}
		return mr;
	}
	
	public static ArrayList<String> subseqwithAscii(String str)
	{
		
		// output ---> b 98 a ab a98 97 97b 9798
		if(str.length()==0)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=subseqwithAscii(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String val:rr)
		{
			
			mr.add(val);
			mr.add(val+ch);
			mr.add(val+(int)ch);		
		}
		return mr;
	}
	
	//print Approach
	public static void Subseq(String ques, String ans) {
		if(ques.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		char ch=ques.charAt(0);
		String ros=ques.substring(1);
	
		Subseq(ros, ans);
		Subseq(ros, ans+ch);
		Subseq(ros, ans+(int)ch);
	}
	// print Approach SubSequence With Ascii
	
	public static void SubseqWithAscii(String ques, String ans) {
		if(ques.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		
		char ch=ques.charAt(0);
		String ros=ques.substring(1);
	
		SubseqWithAscii(ros, ans);
		SubseqWithAscii(ros, ans+ch);
	}
	
	
	public static ArrayList<String> subseq2(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=subseq2(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String val:rr)
		{
			mr.add(val);
			mr.add(val+ch);
		}
		return mr;
	}
	
	static void printSubSeqRec(String str,int n,int index,String curr)
	{
		if(index==n)
		{
			return;
		}
		System.out.print(curr+" ");
		for(int i=index+1;i<n;i++)
		{
			curr+=str.charAt(i);
			printSubSeqRec(str, n, i, curr);
			
			curr=curr.substring(0,curr.length()-1);
		}
		
	}
	
	static void printSubSeq(String str)
	{
		int index=-1;
		String curr="";
		
		printSubSeqRec(str, str.length(), index, curr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
