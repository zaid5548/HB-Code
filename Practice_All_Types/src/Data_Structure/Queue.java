package Data_Structure;

public class Queue {

	protected int[] data;
	protected int front;
	int size;
	
	public Queue()
	{
		this(5);
	}
	public Queue(int cap) {
		data=new int[cap];
		front=0;
		size=0;
	}
	
	public void Enqueue(int item) throws Exception {
		
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		data[front+size]=item;
		size++;
	}
	
	public int Dequeue() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int temp=data[front];
		data[front]=0;
		front++;
		size--;
		
		return temp;
	}

	
	public int getFront() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int temp=data[front];
		
		return temp;
	}
	
	public boolean isEmpty() {
		
		if(size==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		
//		if(size==data.length) {
//			return true;
//		}else {
//			return false;
//		}
		return data.length==size;
	}
	
	public void display() {
		
		System.out.println();
		for(int i=front;i<front+size;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	
	
}
