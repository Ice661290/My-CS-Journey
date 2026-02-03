import javax.swing.JOptionPane;

public class LinkedQueueClass {
	
    private QueueNode qFront,qRear;
    private int count;
	
	public LinkedQueueClass() {
		qFront = null;
		qRear = null;
		count = 0;
	}
	
	//Initialization
	public void initializeQueue(){
		qFront = null;
		qRear = null;
		count = 0;
	}
	
	//Empty
	public boolean isEmptyQueue(){
         return (qFront==null);
}
	
	//Size
		public int sizeQueue(){
			return count;
		}
		
	//Front
		public int front(){
			if(isEmptyQueue())
				return -1;
			else
				return qFront.info;
		}
		
		//Back
				public int back(){
					if(isEmptyQueue())
						return -1;
					else
						return qRear.info;
				}
	//AddQueue
	public void addQueue(int item){
		QueueNode newNode;
		newNode = new QueueNode();
		newNode.info = item;
		newNode.link = null;
		if(qFront==null){
			qFront = newNode;
			qRear = newNode;
		}else{
			qRear.link = newNode;
			qRear = newNode;
		}
		count++;
	}
	
	//Delete
		public void deleteQueue(){
			if(isEmptyQueue())
				JOptionPane.showMessageDialog(null, "Queue Empty,No Delete Item");
			else
				JOptionPane.showMessageDialog(null, "Delete Item is: "+ qFront.info);
			    qFront = qFront.link;
			    if(qFront==null)
			    	qRear = null;
			    count--;
		}
		
		//Print
	    public void printQueue(){
	    	String output = "--Queue list(Linked)--\n";
	    	QueueNode current;
	    	current = qFront;
	    	while(current!=null){
	    		output += current.info + " => ";
	    		current = current.link;
	    	}
	    	JOptionPane.showMessageDialog(null,output);
	    }
}
