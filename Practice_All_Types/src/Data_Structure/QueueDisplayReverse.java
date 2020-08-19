package Data_Structure;

public class QueueDisplayReverse extends CQueue {

	public static void displayreverse(CQueue q,int count) throws Exception {
		if(count==q.size()) {
			return;
		}
		
		int temp=q.Dequeue();
		q.Enqueue(temp);
		displayreverse(q,count+1);
		System.out.println(temp);
		
	}

	
//	@Override
//	
//	public void Enqueue(int item) throws Exception {
//		if(isFull()) {
//			throw new Exception("Queue is Full");
//		}
//		data[front+size]=item;
//		System.out.print(data[front+size]+" ");
//		size++;
//	}
	
	public static void Actualreverse(CQueue q) throws Exception {
		
		if(q.isEmpty()) {
			return;
		}
		int temp=q.Dequeue();
		Actualreverse(q);
		System.out.print(temp+" ");
		q.Enqueue(temp);
		
	}
	
	
	
	public static void main(String[] args) throws Exception {

		CQueue qdr=new QueueDisplayReverse();
		qdr.Enqueue(10);
		qdr.Enqueue(20);
		qdr.Enqueue(30);
		qdr.Enqueue(40);
		qdr.Enqueue(50);
		qdr.display();
//		Actualreverse(qdr);
		displayreverse(qdr,0);
		System.out.println("****  Original Queue is Actual Change Change*****");
		qdr.display();
	}

}
