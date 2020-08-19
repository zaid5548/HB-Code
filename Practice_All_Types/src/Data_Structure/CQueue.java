package Data_Structure;

public class CQueue {

	int[] data;
	int front;
	int size;
	
	public CQueue()
	{
		this(5);
	}
	public CQueue(int cap) {
		data=new int[cap];
		front=0;
		size=0;
	}
	
	public void Enqueue(int item) throws Exception {
		
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		data[(front+size)%data.length]=item;
		size++;
	}
	
	public int Dequeue() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int temp=data[front];
		data[front]=0;
		front=(front+1)%data.length;
		size--;
		
		return temp;
	}
	
	//Getter
	public int size() {
		return size;
	}
	
	//Setter
	public void new_size(int ns) {
		size=ns;
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
			int idx=i%data.length;
			System.out.print(data[idx]+" ");
		}
		System.out.println();
	}
	
	
	
}
