package Stack_Queue;

public class Snippet {
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

