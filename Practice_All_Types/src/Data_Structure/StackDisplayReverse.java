package Data_Structure;

import java.util.Stack;

public class StackDisplayReverse extends Stack_Created {

	public static void displayreverse(StackDisplayReverse s) throws Exception {
		if(s.isEmpty()) {
			return;
		}
		
		int temp=s.pop();
		displayreverse(s);
		System.out.println(temp);
		s.push(temp);
	}
	
	

	
	public static void main(String[] args) throws Exception {
		
		StackDisplayReverse sdr=new StackDisplayReverse();
		sdr.push(10);
		sdr.push(20);
		sdr.push(30);
		sdr.push(40);
		sdr.push(50);
		displayreverse(sdr);
		System.out.println("******After display reverse my originol stack******");
		sdr.display();
	}

}
