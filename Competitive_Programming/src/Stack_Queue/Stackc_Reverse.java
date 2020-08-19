package Stack_Queue;


public class Stackc_Reverse extends Stack{

	public static void main(String[] args) throws Exception {
		Stackc_Reverse sr=new Stackc_Reverse();
		sr.push(10);
		sr.push(20);
		sr.push(30);
		sr.push(40);
		sr.push(50);
		displayreverse(sr,new Stackc_Reverse());
		System.out.println("******After display reverse my originol stack******");
		sr.display();

	}

	private static void displayreverse(Stackc_Reverse sr,Stackc_Reverse h) throws Exception {
		if(sr.isEmpty()) {
			displayreverse_1(sr, h);
			return;
		}
		h.push(sr.pop());
		displayreverse(sr, h);
		
	}

	private static void displayreverse_1(Stackc_Reverse sr, Stackc_Reverse h) throws Exception {
		if(h.isEmpty()) {
			return;
		}
		
		int temp=h.pop();
		System.out.println(temp);
		displayreverse_1(sr, h);
		sr.push(temp);
		
	}

}
