package Data_Structure;
import Data_Structure.Queue;
import Data_Structure.DynemicQueue;
public class StackUsingQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_Created s=new Stack_Created();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		System.out.println("Poped Element is -> "+s.pop());	
		s.push(60);
		s.display();
		System.out.println("Poped Element is -> "+s.pop());	
		s.push(70);
		s.display();

	}
		
	static DynemicQueue primary=new DynemicQueue();
	
	public static void push(int item) throws Exception {
	
		try {
		primary.Enqueue(item);
		}
		catch (Exception e) {
			throw new Exception("Stack is Full");
		}
		}
	
	public static int pop() throws Exception {
		DynemicQueue helper=new DynemicQueue();
		try {
		while(primary.size()>1) {
			helper.Enqueue(primary.Dequeue());
		}
		int temp=primary.Dequeue();
		
		while(!helper.isEmpty()) {
			primary.Enqueue(helper.Dequeue());
		}
		return temp;
		}
		catch (Exception e) {
			throw new Exception("Stack is Empty");
		}
	}
}
