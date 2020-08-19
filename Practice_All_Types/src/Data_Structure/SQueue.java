package Data_Structure;

public class SQueue {

	public static void main(String[] args) throws Exception {

		Queue q=new Queue();
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		System.out.println("display queue element");
		q.display();
		System.out.println();
		System.out.println(q.Dequeue());
//		System.out.println(q.Dequeue());
//		System.out.println(q.Dequeue());
//		System.out.println(q.Dequeue());
//		System.out.println(q.Dequeue());
//		System.out.println(q.Dequeue());

		q.display();
//		q.Enqueue(6);
		System.out.println(q.Dequeue());
		q.display();
		System.out.println(q.getFront());
	}

}
