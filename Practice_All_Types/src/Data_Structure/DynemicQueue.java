package Data_Structure;

public class DynemicQueue extends CQueue {

	
	@Override
	public void Enqueue(int item) throws Exception {
//		if(isFull()) {
//			int[] na=new int[2*data.length];
//			for(int i=front;i<data.length;i++) {
//				na[i]=data[i];
//			}
//			data=na;
//			front=0;
//		}
		if(isFull()) {
			int[] na=new int[2*data.length];
			for(int i=0;i<size;i++) {
				int idx=(front+i)%data.length;
				na[i]=data[idx];
			}
			data=na;
			front=0;
		}
		super.Enqueue(item);
	}
	
	
}
