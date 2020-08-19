package Data_Structure;

public class StockSpan {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		int[] arr= {8,5,4,1,7,5,10,2};
		int[] arr= {30,10,80,20,10,5,50,40,60,10,5,100};
		stockspan(arr);
	}
	
	public static void stockspan(int[] arr) throws Exception {
		DynemicStack s=new DynemicStack();
		int[] res=new int[arr.length];
//		s.push(0);
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()]<arr[i]) {
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
