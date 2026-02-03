import javax.swing.JOptionPane;     

public class SampleStack {
	
	static SampleStack s = new SampleStack();
	static StackArrayClass sac = new StackArrayClass();
	static StackLinkedClass slc = new StackLinkedClass();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s.menu();
	}
	public void menu(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog("####################\n"+	
															  "     Main Menu\n"+
															  "####################\n"+
															  "1. Implement by Array\n"+
															  "2. Implement by Linked List\n"+
															  "0. Exit\n"+
															  "####################\n"+
															  "Select to choice number : "));
			switch(ch){
			case 1 : s.subArray();
					break;
			case 2 : s.subLinkedList();
					break;
			}
		}while(ch!=0);
	}
	public void subArray(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog("####################\n"+
															  "    Stack by Array\n"+
															  "####################\n"+
															  "1. Initialization\n"+
															  "2. Empty Stack\n"+
															  "3. Full Stack\n"+
															  "4. Push\n"+
															  "5. Top\n"+
															  "6. Pop\n"+
															  "7. Print\n"+
															  "0. returnto main menu\n"+
															  "####################\n"+
															  "Selectto choice number : "));
			switch(ch){
			case 1 : sac.initializeStack();
					break;
			case 2 : if(sac.isEmptyStack())
				        JOptionPane.showMessageDialog(null, "Stack is Empty");
			         else
			        	 JOptionPane.showMessageDialog(null, "Stack is not Empty");
					break;
			case 3 : if(sac.isFullStack())
		               JOptionPane.showMessageDialog(null, "Stack is Full");
	                 else
	        	       JOptionPane.showMessageDialog(null, "Stack is not Full");
					break;
			case 4 : int item = Integer.parseInt(JOptionPane.showInputDialog("Enter Item: "));
			         sac.push(item);
					break;
			case 5 : if(sac.top() == -1)
				      JOptionPane.showMessageDialog(null, "Stack Empty");
			         else
			        	 JOptionPane.showMessageDialog(null, "Stack Top is " + sac.top());
					break;
			case 6 : sac.pop();
					break;
			case 7 : sac.printStack();
					break;
			}
		}while(ch!=0);
	}
	
	public void subLinkedList(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog("####################\n"+
															  "Stack by Linked List\n"+
															  "####################\n"+
															  "1. Initialization\n"+
															  "2. Empty Stack\n"+
															  "3. Push\n"+
															  "4. Top\n"+
															  "5. Pop\n"+
															  "6. Print\n"+
															  "0. returnto main menu\n"+
															  "####################\n"+
															  "Selectto choice number : "));
			switch(ch){
			case 1 :  slc.initializeStack();
					break;
			case 2 : if(slc.isEmptyStack())
		                JOptionPane.showMessageDialog(null, "Stack is Empty");
	                 else
	        	        JOptionPane.showMessageDialog(null, "Stack is not Empty");
					break;
			case 3 : int item = Integer.parseInt(JOptionPane.showInputDialog("Enter Item: "));
	                 slc.push(item);
					break;
			case 4 : if(slc.top() == -1)
			          JOptionPane.showMessageDialog(null, "Stack Empty");
	                 else
	        	      JOptionPane.showMessageDialog(null, "Stack Top is " + slc.top());
					break;
			case 5 : slc.pop();
					break;
			case 6 : slc.printLinkedList();
					break;
			}
		}while(ch!=0);
	}
	
}
