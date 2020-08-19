package Data_Structure;

public class DynemicStack extends Stack_Created {

	
	
	@Override
	public void push(int item) throws Exception {
		if(isFull()) {
			int[] na=new int[2*data.length];
			for(int i=0;i<data.length;i++) {
				na[i]=data[i];
			}
			data=na;
		}
		super.push(item);
	}	
}
