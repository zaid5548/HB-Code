package Data_Structure;

import java.util.Stack;

public class ActualStackReverse extends Stack_Created{

	
	public static void Actualreverse(ActualStackReverse s,ActualStackReverse h) throws Exception {
		
		if(s.isEmpty()) {
			ActualReverse_1(s,h);
			return;
		}
		h.push(s.pop());
		Actualreverse(s,h);
		
		
	}
	
	public static void  ActualReverse_1(ActualStackReverse s,ActualStackReverse h) throws Exception {
		if(h.isEmpty()) {
			return;
		}
		
		int temp=h.pop();
		ActualReverse_1(s,h);
		s.push(temp);
		
	}
	
	
	public static void main(String[] args) throws Exception {

		
		ActualStackReverse s=new ActualStackReverse();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		System.out.println("************");
		Actualreverse(s, new ActualStackReverse());
		s.display();
	}

}
