package Stack_Queue;

public class Circuler_Queue {

	int[] data;
	int front;
	int size;
	public Circuler_Queue() {
		data=new int[5];
		front=0;
		size=0;
	}
	
	public void CirculerEnqueue(int item) throws Exception {
		
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		
		data[(front+size)%data.length]=item;
		size++;
		
	}
	public int CirculerDequeue() throws Exception {
		if(isEmpty()) {
//			System.out.println("Queue is Empty");
//			return -1;
			throw new Exception("Queue is Empty");
		}
		int temp=data[front];
		front=(front+1)%data.length;
		size--;
		return temp;
		
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return data.length==size;
	}
	
	public int getFirst() throws Exception {
		if(isEmpty()) {
//			System.out.println("Queue is Empty");
//			return -1;
			throw new Exception("Queue is Empty");
		}
		return data[front];
	}
	
	public void display() {
		
		for(int i=front;i<front+size;i++) {
			int idx=(i)%data.length;
			System.out.println(data[idx]);
		}
		
	}
	
}
