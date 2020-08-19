package Stack_Queue;

public class Stack_Using_Queue {
	
//	 Push Efficient
		Queue primary=new Dynemic_Queue();
		
		public void push(int item) throws Exception {
			primary.Enqueue(item);
		}
		
		public int pop() throws Exception {
			try {
			Queue helper=new Dynemic_Queue();
			while(primary.size()>1) {
				helper.Enqueue(primary.Dequeue());
				
			}
			int temp=primary.Dequeue();
			
			while(!helper.isEmpty()) {
				primary.Enqueue(helper.Dequeue());
			}
			return temp;
		}catch(Exception e) {
			 throw new Exception("Stack is Empty");
		 }
	 }
		
//		POP Efficient
		Queue Secondry=new Dynemic_Queue();
		public void push_2(int item) throws Exception {
			Queue helper=new Dynemic_Queue();
			while(Secondry.size()>0) {
				helper.Enqueue(Secondry.Dequeue());
			}
			Secondry.Enqueue(item);
			while(helper.size()>0) {
				Secondry.Enqueue(helper.Dequeue());
			}
		}
		
		public int pop_2() throws Exception {
			return Secondry.Dequeue();
		}
		
		
		public static void main(String[] args) throws Exception {
			Stack s=new Dynemic_Stack();
			s.push(10);
			s.push(20);
			s.push(30);
			System.out.println(s.pop());
			System.out.println("*****************");
			s.push(40);
			s.push(50);
			s.display();
		}
	
}
