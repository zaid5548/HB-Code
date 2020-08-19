package Stack_Queue;

public class Client_Queue {

	public static void main(String[] args) throws Exception {
		
		Queue q=new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		System.out.println("Deleted Element is "+q.Dequeue());
		q.Enqueue(40);
		q.Enqueue(50);
		q.Enqueue(60);
		q.display();
//		System.out.println("*****Dequeue Operation**********");
//		System.out.println("Deleted Element is "+q.Dequeue());
//		System.out.println("Deleted Element is "+q.Dequeue());
//		System.out.println("Deleted Element is "+q.Dequeue());
//		System.out.println("Deleted Element is "+q.Dequeue());
//
//		System.out.println("Deleted Element is "+q.Dequeue());
//		System.out.println("First Element is "+q.getFirst());
//		System.out.println("Size is "+q.size);
//		System.out.println("Queue is Empty "+q.isEmpty());
//		System.out.println("Queue is Full "+q.isFull());
		
	}

}
