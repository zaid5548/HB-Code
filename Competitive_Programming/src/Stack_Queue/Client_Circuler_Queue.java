package Stack_Queue;

public class Client_Circuler_Queue {

	public static void main(String[] args) throws Exception {
		Circuler_Queue cq=new Circuler_Queue();
		cq.CirculerEnqueue(10);
		cq.CirculerEnqueue(20);
		cq.CirculerEnqueue(30);
		cq.CirculerEnqueue(40);
		cq.CirculerEnqueue(50);
//		cq.CirculerEnqueue(60);
		cq.display();
		System.out.println("Deleted Element "+cq.CirculerDequeue());
		cq.CirculerEnqueue(60);
		cq.display();
	}

}
