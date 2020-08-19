package Stack_Queue;


public class Stack_Display_Reverse extends Stack{

	
	
	public static void main(String[] args) throws Exception {
		
		Stack_Display_Reverse sdr=new Stack_Display_Reverse();
		sdr.push(10);
		sdr.push(20);
		sdr.push(30);
		sdr.push(40);
		sdr.push(50);
		displayreverse(sdr);
		System.out.println("******After display reverse my originol stack******");
		sdr.display();

	}

	private static void displayreverse(Stack_Display_Reverse sdr) throws Exception {
		if(sdr.isEmpty()) {
			return;
		}
		
		int temp=sdr.pop();
		displayreverse(sdr);
		System.out.println(temp);
		sdr.push(temp);
		
	}

}
