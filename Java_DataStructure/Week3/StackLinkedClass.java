import javax.swing.JOptionPane;

public class StackLinkedClass {
     private StackNode stackTop;
     
	public StackLinkedClass() {
		// TODO Auto-generated constructor stub
		stackTop = null;
	}
	
  //Initialize_StackLinkedList
    public void initializeStack(){
    	stackTop = null;
    }
    
  //Empty_StackedLinkedList  
    public boolean isEmptyStack(){
    	return (stackTop == null);
    }
    
  //Push_StackedLinkedList
    public void push(int item){
    	StackNode newNode;
    	newNode = new StackNode();
    	newNode.info = item;
    	newNode.link = stackTop;
    	stackTop = newNode;
    }
    
  //Top_StackedLinkedList
    public int top(){
    	if(isEmptyStack())
    		return -1;
    	else
    		return stackTop.info;
    }
    
  //Pop_StackedLinkedList 
    public void pop(){
    	if(isEmptyStack())
    		JOptionPane.showMessageDialog(null, "No Pop Item");
    	else
    		JOptionPane.showMessageDialog(null, "Pop is " + stackTop.info);
    	    stackTop = stackTop.link;
    }
  
  //Print_StackedLinkedList 
    public void printLinkedList(){
    	String output = "--Stack (Linked List) --\n";
    	StackNode current;
    	current = stackTop;
    	while(current!=null){
    		output += current.info + " ==> ";
    		current = current.link;
    	}
    	JOptionPane.showMessageDialog(null,output);
    }
}
