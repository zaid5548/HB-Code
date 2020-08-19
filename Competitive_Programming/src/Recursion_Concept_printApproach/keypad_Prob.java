package Recursion_Concept_printApproach;

public class keypad_Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad("143", "");
	}

	public static void keypad(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch=ques.charAt(0);
		String ros=ques.substring(1);
		
		String code=getCode(ch);
		for(int i=0;i<code.length();i++){
			
			char temp=code.charAt(i);
			keypad(ros, ans+temp);
		}
		
	}
	
	public static String getCode(char ch)
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
		else if(ch=='2')
			return "+";
		else
			return "";
	}
	
}
