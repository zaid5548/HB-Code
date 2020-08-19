package Stack_Queue;

public class Stack {
	
	 int[] data;
	int tos;
	
	public Stack() {
		data=new int[5];
		tos=-1;
	}
	public Stack(int[] arr) {
		data=arr;
		tos=-1;
	}
	
	public  void push(int item) throws Exception {
		if(isFull()) {
//			System.out.println("Stack is Full");
//			return;
			throw new Exception("Stack is Full");
		}
		tos++;
		data[tos]=item;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
//			System.out.println("Stack is Empty");
//			return -1;
			throw new Exception("Stack is Empty");
		}
		int PopedItem=data[tos];
		data[tos]=0;
		tos--;
		return PopedItem;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
//			System.out.println("Stack is Empty");
//			return -1;
			throw new Exception("Stack is Empty");
		}
		return data[tos];
	}
	
	public int size() {
		return tos+1;
		
	}
	
	public boolean isEmpty() {
		return tos==-1;
	}
	public boolean isFull() {
		if(tos==data.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void display() {
		for(int i=tos;i>=0;i--){
			System.out.println(data[i]);
		}
		
	}
	
}
