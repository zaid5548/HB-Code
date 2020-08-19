package Stack_Queue;

public class Queue_Reverse extends Queue{

	public static void main(String[] args) throws Exception {
		
		Queue_Reverse qdr=new Queue_Reverse();
		qdr.Enqueue(10);
		qdr.Enqueue(20);
		qdr.Enqueue(30);
		qdr.Enqueue(40);
		qdr.Enqueue(50);
		qdr.display();
		displayReverse(qdr);
		System.out.println("After Reverse Queue My Oroginal Queue is There");
		qdr.display();
	}

	private static void displayReverse(Queue_Reverse qdr) throws Exception {
		
		if(qdr.isEmpty()) {
			return;
		}
		int temp=qdr.Dequeue();
		displayReverse(qdr);
		System.out.print(temp+" ");
		qdr.Enqueue(temp);
	}

	

}
