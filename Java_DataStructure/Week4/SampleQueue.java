import javax.swing.JOptionPane;
public class SampleQueue {

	/**
	 * @param args
	 */
	static SampleQueue q = new SampleQueue();
    static ArrayQueueClass aqc = new ArrayQueueClass();
    static LinkedQueueClass lqc = new LinkedQueueClass();
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q.menu();
	}
	public void menu(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog(
					"#######################\n"+
					"   Main Menu of Queue\n"+
					"#######################\n"+
					"1.  Implement by Array\n"+
					"2.  Implement by Linked list\n"+
					"0.  Exit\n"+
					"#######################\n"+
					"Selection to choice number : "));
			switch(ch){
				case 1 : q.subMenuArray();
						 break;
				case 2 : q.subMenuLinked();
						 break;
			}
		}while(ch!=0);
	}
	public void subMenuArray(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog(
					"###################\n" +
					"  Implement by Array\n"+
					"####################\n"+
					"1.  initialization\n"+
					"2.  empty Queue\n"+
					"3.  full Queue\n"+
					"4.  Front Value\n"+
					"5.  Back Value\n"+
					"6.  Add Queue\n"+
					"7.  Delete Queue\n"+
					"8.  print\n"+
					"9.  size of Queue\n"+
					"0.  return to main menu\n"+
					"####################\n"+
					"Selection to choice number "));
			switch(ch){
				case 1: aqc.initiallizeQueue();
						break;
				case 2: if(aqc.isEmptyQueue())
					       JOptionPane.showMessageDialog(null, "Queue is Empty");
				        else
				        	JOptionPane.showMessageDialog(null, "Queue is not Empty");
						break;
				case 3: if(aqc.isFullQueue())
				           JOptionPane.showMessageDialog(null, "Queue is Full");
			            else
			        	   JOptionPane.showMessageDialog(null, "Queue is not Full");
						break;
				case 4: if(aqc.front()==-1)
					        JOptionPane.showMessageDialog(null, "Queue Empty,No Front Value");
				        else
				        	JOptionPane.showMessageDialog(null, "Front is :" + aqc.front());
						break;
				case 5:	if(aqc.Back()==-1)
			               JOptionPane.showMessageDialog(null, "Queue Empty,No Back Value");
		                else
		        	       JOptionPane.showMessageDialog(null, "Back is :" + aqc.Back());
						break;
				case 6: int item = Integer.parseInt(JOptionPane.showInputDialog("Enter item: "));
				        aqc.addQueue(item);
						break;
				case 7: aqc.deleteQueue();
						break;
				case 8: aqc.printQueue();
						break;
				case 9 :JOptionPane.showMessageDialog(null, "Size of Array Queue: " + aqc.sizeQueue());
						break;
						
			}
		}while(ch!=0);

	}
	public void subMenuLinked(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog(
					"###################\n" +
					"  Implement by LinkedList\n"+
					"####################\n"+
					"1.  initialization\n"+
					"2.  empty Queue\n"+
					"3.  size Queue\n"+
					"4.  Front Value\n"+
					"5.  Back Value\n"+
					"6.  Add Queue\n"+
					"7.  Delete Queue\n"+
					"8.  print\n"+
					"0.  return to main menu\n"+
					"####################\n"+
					"Selection to choice number "));
			switch(ch){
				case 1: lqc.initializeQueue();
						break;
				case 2: if(lqc.isEmptyQueue())
				          JOptionPane.showMessageDialog(null, "Queue is Empty");
			            else
			        	  JOptionPane.showMessageDialog(null, "Queue is not Empty");
						break;
				case 3: JOptionPane.showMessageDialog(null, "Size of Linked Queue: " + lqc.sizeQueue());
						break;
				case 4: if(lqc.front()==-1)
			             JOptionPane.showMessageDialog(null, "Linked Queue Empty,No Front Value");
		                else
		        	     JOptionPane.showMessageDialog(null, "Front is :" + lqc.front());
						break;
				case 5:	if(lqc.back()==-1)
			              JOptionPane.showMessageDialog(null, "Queue Empty,No Back Value");
		                else
		        	      JOptionPane.showMessageDialog(null, "Back is :" + lqc.back());
						break;
				case 6: int item = Integer.parseInt(JOptionPane.showInputDialog("Enter item: "));
		                lqc.addQueue(item);
						break;
				case 7: lqc.deleteQueue();
						break;
				case 8: lqc.printQueue();
						break;
			}
		}while(ch!=0);

	}
}
