package Data_Structure;

public class ClientDynemicQueue {

	public static void main(String[] args) throws Exception {

		DynemicQueue dq=new DynemicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		System.out.println("First Delete item --> "+dq.Dequeue());
		System.out.println("Second Delete item --> "+dq.Dequeue());
		System.out.println("Third Delete item --> "+dq.Dequeue());
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.display();
		System.out.println("******************************************");
//		System.out.println("First Delete item --> "+dq.Dequeue());
//		System.out.println("Second Delete item --> "+dq.Dequeue());
//		System.out.println("Third Delete item --> "+dq.Dequeue());
//		System.out.println("*****");
//		dq.display();
	}

}
