package String_Problem;

public class String_Practice_1 {

	public static void main(String[] args) {
		String[] str= {"iamzaidKhan","mynameiskhan","india","usakimojhyaar"};
		String ans="zaid";
		for(int i=0;i<str.length;i++) {
			String res=str[i];
				if(res.contains(ans)) {
					System.out.println(res);
				}
		}
		
	}

}
