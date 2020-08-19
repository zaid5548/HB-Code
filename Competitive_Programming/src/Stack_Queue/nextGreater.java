package Stack_Queue;

import java.util.Scanner;

public class nextGreater {

	public static void main(String[] args) throws Exception {
		Scanner scn=new Scanner(System.in);
//		int[] arr= {1,5,2,1,3,6,10,9};
//		NextGreater(arr);
		int[] arr= {4,8,5,2,9,10};
		stockSpan(arr);

	}

	private static void NextGreater(int[] arr) throws Exception {
		Stack s=new Dynemic_Stack();
		s.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
			while(!s.isEmpty()&&s.peek()<arr[i]) {
				System.out.println(s.peek()+"-->"+arr[i]);
				s.pop();
			}
			s.push(arr[i]);
		}
		while(!s.isEmpty()) {
			System.out.println(s.peek()+"-->"+-1);
			s.pop();
		}
	}
	
	private static void stockSpan(int[] arr) throws Exception {
		Stack s=new Stack();
		int[] res=new int[arr.length];
		s.push(0);
		res[0]=1;
		for(int i=1;i<arr.length;i++) {
			while(!s.isEmpty() && arr[i]>arr[s.peek()]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				res[i]=i+1;
			}else {
				res[i]=i-s.peek();
			}
			s.push(i);
		}
		for(int val:res) {
			System.out.print(val+" ");
		}
		
	}

}
