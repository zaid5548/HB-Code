package Stack_Queue;

public class Queue_Display_Reverse extends Queue{

	public static void main(String[] args) throws Exception {
		Queue_Display_Reverse qdr=new Queue_Display_Reverse();
		qdr.Enqueue(10);
		qdr.Enqueue(20);
		qdr.Enqueue(30);
		qdr.Enqueue(40);
		qdr.Enqueue(50);
		displayReverse(qdr,0);
		System.out.println("After Reverse Queue My Oroginal Queue is There");
		qdr.display();
	}

	private static void displayReverse(Queue_Display_Reverse qdr,int cnt) throws Exception {
		if(cnt==qdr.size()) {
			return;
		}
		
		int temp=qdr.Dequeue();
		qdr.Enqueue(temp);
		displayReverse(qdr,cnt+1);
		System.out.println(temp);
	}

}
