package Stack_Queue;

public class Queue {

	int[] data;
	int front;
	int size;
	public Queue() {
		data=new int[5];
		front=0;
		size=0;
	}
	
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
//			System.out.println("Queue is Full");
//			return;
			throw new Exception("Queue is Full ");
		}
		data[(front+size)%data.length]=item;
		size++;
	}
	


	public int Dequeue() throws Exception {
		if(isEmpty()) {
//			System.out.println("Queue is Empty");
//			return -1;
			throw new Exception("Queue is Empty");
		}
		int temp=data[front];
		front++;
		size--;
		return temp;
		
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return data.length==size;
	}
	
	//Getter
	public int size() {
		return size;
	}
	
	//Setter
	public void new_size(int ns) {
		size=ns;
	}
	
	public int getFirst() throws Exception {
		if(isEmpty()) {
//			System.out.println("Queue is Empty");
//			return -1;
			throw new Exception("Queue is Empty");
		}
		return data[front];
	}
	
//	public void display() {
//		
//		for(int i=front;i<front+size;i++) {
//			System.out.println(data[i]);
//		}
//		
//	}
public void display() {
		
		System.out.println();
		for(int i=front;i<front+size;i++) {
			int idx=i%data.length;
			System.out.print(data[idx]+" ");
		}
		System.out.println();
	}
	
}
