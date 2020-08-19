package Data_Structure;

public class NextGreaterUsingStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		DynemicStack s=new DynemicStack();
		int[] arr={1,5,2,1,3,2,6,10,9};
		NextGreater_2(arr);
		
	}
	
	
	public static void NextGreater(int[] arr) throws Exception {
		
		DynemicStack s=new DynemicStack();
		s.push(arr[0]);
		
		for(int i=1;i<arr.length;i++)
		{
			while(!s.isEmpty() && s.peek()<arr[i]) {
				System.out.println(s.pop()+" "+arr[i]);
			}
			s.push(arr[i]);
		}
		
		while(!s.isEmpty()) {
			System.out.println(s.pop()+"  -1");
		}
	}
	
	public static void NextGreater_2(int[] arr) throws Exception {
		
		//all function use of DynemicStack Class
		DynemicStack s=new DynemicStack();
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(!s.isEmpty() && arr[s.peek()]<arr[i]) {
				res[s.pop()]=arr[i];
			}
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			res[s.pop()]=-1;
		}
		
		for(int val:res) {
			System.out.println(val+" ");
		}
	}

}
