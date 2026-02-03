import javax.swing.JOptionPane;

public class ArrayQueueClass {
	
     private int maxQueueSize,qFront,qRear,count;
     private int list[];
     
	public ArrayQueueClass() {
		maxQueueSize = 10;
		qFront = 0;
		qRear = maxQueueSize-1;
		count = 0;
		list = new int[maxQueueSize];
		 for(int i=0; i<maxQueueSize; i++){
			 list[i] =-1;
			 
		 }
	}
	
    public ArrayQueueClass(int max) {
		if(max <= 0){
			JOptionPane.showMessageDialog(null,"Size Error");
			maxQueueSize = 10;
		}else{
		    maxQueueSize = max;
		}
		qFront = 0;
		qRear = maxQueueSize-1;
		count = 0;
		list = new int[maxQueueSize];
		 for(int i=0; i<maxQueueSize; i++){
			 list[i] =-1;
			 
		 }
	}
    
    //Initialization
    public void initiallizeQueue(){
    	qFront = 0;
		qRear = maxQueueSize-1;
		count = 0;
		 for(int i=0; i<maxQueueSize; i++){
			 list[i] =-1;
    }
    }
    
    //Empty
    public boolean isEmptyQueue(){
    	return (count == 0);
    }
    //Full
    public boolean isFullQueue(){
    	return (count==maxQueueSize);
    }
    
    //Front Value
    public int front(){
    	if(isEmptyQueue())
    		return -1;
    	else
    		return list[qFront];
    }
    
  //Back Value
    public int Back(){
    	if(isEmptyQueue())
    		return -1;
    	else
    		return list[qRear];
    }
    
  //Add Queue
    public void addQueue(int item){
        if(isFullQueue())
        	JOptionPane.showMessageDialog(null, "Queue Full, No Add Item");
        else{
        	qRear = (qRear+1)%maxQueueSize;
        	list[qRear] = item;
        	count++;
        }
}
    
    //Delete Queue
    public void deleteQueue(){
    	if(isEmptyQueue()){
    		JOptionPane.showMessageDialog(null, "Queue Empty,No delete item");
    	}else{
    		JOptionPane.showMessageDialog(null, "Delete Item is " +list[qFront]);
    		list[qFront] = -1;
    		qFront = (qFront+1)%maxQueueSize;
    		count--;
    	}
    }
    
    //Print Queue
    public void printQueue(){
    	String output = "--Queue list--\n";
    	for(int i=0; i<maxQueueSize; i++){
    		output += "List[ "+i+" ] => "+list[i]+"\n";
    	}
    	JOptionPane.showMessageDialog(null, output);
    }
    
  //Size Queue
    public int sizeQueue(){
    	return count;
    }
}