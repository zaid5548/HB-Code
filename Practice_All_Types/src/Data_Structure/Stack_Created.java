package Data_Structure;

public class Stack_Created {
	
	protected int data[];
	protected int tos;
	
	public Stack_Created() {
		 data=new int[5];
		 this.tos=-1;
	}
	public Stack_Created(int cap) {
		 data=new int[cap];
		 this.tos=-1;
	}
	
	public void push(int item) throws Exception
	{
		if(isFull())
		{
//			System.out.println("Stack is full");
//			return;
			throw new Exception("Stack is Full");
		}
		this.tos++;
		data[tos]=item;
		
		
	}
	
	public int pop() throws Exception
	{
		if(isEmpty())
		{
//			System.out.println("Stack is empty");
//			return -1;
			throw new Exception("Stack is empty");
		}
		int temp=data[tos];
		data[tos]=0;
		this.tos--;
		
		return temp;
	}
	public int peek() throws Exception
	{
		if(isEmpty())
		{
//			System.out.println("Stack is empty");
//			return -1;
			throw new Exception("Stack is empty");

		}
		return data[tos];
	}
	public int size()
	{
		return tos++;
	}
	public boolean isFull()
	{
		if(tos==data.length-1)
		{
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty()
	{
//		return tos==-1;
		if(tos==-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public void display()
	{
		for(int i=tos;i>=0;i--)
		{
			System.out.println(data[i]);
		}
	}
	
}
