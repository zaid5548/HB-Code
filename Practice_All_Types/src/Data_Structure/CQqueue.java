package Data_Structure;

public class CQqueue {

	public static void main(String[] args) throws Exception {

		CQueue q=new CQueue();
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		q.display();
		System.out.println(q.Dequeue());
		q.display();
		q.Enqueue(6);
//		q.Enqueue(7);
//		q.Enqueue(8);
		System.out.println(q.Dequeue());
		q.display();		System.out.println(q.Dequeue());
		q.display();		System.out.println(q.Dequeue());
		q.display();
		q.display();
	}

}
