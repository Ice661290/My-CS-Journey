import javax.swing.JOptionPane;

public class SampleLinkedList {
   
	static SampleLinkedList s = new SampleLinkedList();
	static LinkedListClass llc = new  LinkedListClass();
	
	public static void main(String[] args) {
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog(
					"####################\n"+
					"		Main Menu\n"+
					"####################\n"+
					"1. Initialization\n"+
					"2. Check Empty list\n"+
					"3. Find number of item\n"+
					"4. Retrieve data in first node\n"+
					"5. Retrieve data in last node\n"+
					"6. Building a Linked List\n"+
					"7. Search list\n"+
					"8. Insert item in list\n"+
					"9. Delete item from list\n"+
					"10. Print list\n"+
					"0. Exit\n"+
					"####################\n"+
					"Selection to choice number : "));
			switch(ch){
				case 1 : llc.initializeList();
						 break;
				case 2 : if(llc.isEmptyList())
					        JOptionPane.showMessageDialog(null, "List is Empty");
					     else
					    	 JOptionPane.showMessageDialog(null, "List is not Empty");
						 break;
				case 3 : JOptionPane.showMessageDialog(null, "Number of Node is " + llc.findNumber());
						 break;
				case 4 : if(llc.front()==-1)
					         JOptionPane.showMessageDialog(null, "Empty List,No Data");
				         else
				        	 JOptionPane.showMessageDialog(null, "First Node is " + llc.front());
						 break;
				case 5 : if(llc.back()==-1)
			         JOptionPane.showMessageDialog(null, "Empty List,No Data");
		         else
		        	 JOptionPane.showMessageDialog(null, "Last Node is " + llc.back());
						 break;
				case 6 : s.subBuild();
						 break;
				case 7 : int searchItem = Integer.parseInt(JOptionPane.showInputDialog("Enter item want to search: "));
					     llc.searchList(searchItem);
						 break;
				case 8 : s.subInsert();
						 break;
				case 9 : s.subDelete();
						 break;
				case 10 : llc.printList();
						  break;
				default : JOptionPane.showMessageDialog(null, "Exit program","LinkList Program",JOptionPane.WARNING_MESSAGE);
						 
			}
		}while(ch!=0);
		
	}
	public void subBuild(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog(
				"####################\n"+
				"SubMenu Building\n"+
				"####################\n"+
				"1. Forward Building\n"+
				"2. Backward Building\n"+
				"0. return to MainMenu\n"+
				"####################\n"+
				"Selection to choice number : "));
			switch(ch){
				case 1 : llc.forwardList();
						 break;
				case 2 : llc.backwardList();
					 	 break;
				default : JOptionPane.showMessageDialog(null, "Return to Main Menu","LinkList Program",JOptionPane.WARNING_MESSAGE);
			}
		}while(ch!=0);
	
	}	
	public void subInsert(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog(
					"####################\n"+
					"SubMenu Insert\n"+
					"####################\n"+
					"1. Insert First\n"+
					"2. Insert Last\n"+
					"3. Insert Other\n"+
					"0. return to Main Menu\n"+
					"####################\n"+
					"Selection to choice number : "));
			switch(ch){
				case 1 : int insertItem = Integer.parseInt(JOptionPane.showInputDialog("Enter insert item : "));
				         llc.insertFirst(insertItem);
						 break;
				case 2 : int insertItem1 = Integer.parseInt(JOptionPane.showInputDialog("Enter insert item : "));
		                 llc.insertLast(insertItem1);
				 		 break;
				case 3 : int insertItem2 = Integer.parseInt(JOptionPane.showInputDialog("Enter insert item : "));
				         int location = Integer.parseInt(JOptionPane.showInputDialog("Enter location : "));
                         llc.insertOther(insertItem2,location);
					 	 break;
				default : JOptionPane.showMessageDialog(null, "Return to Main Menu","LinkList Program",JOptionPane.WARNING_MESSAGE);
			}
		}while(ch!=0);
	
	}	
	public void subDelete(){
		int ch;
		do{
			ch = Integer.parseInt(JOptionPane.showInputDialog(
					"####################\n"+
					"SubMenu Delete\n"+
					"####################\n"+
					"1. Delete First\n"+
					"2. Delete Last\n"+
					"3. Delete Other\n"+
					"0. return to Main Menu\n"+
					"####################\n"+
					"Selection to choice number : "));
			switch(ch){
				case 1 : llc.deleteFirst();
						 break;
				case 2 : llc.deleteLast();
					 	 break;
				case 3 : int value = Integer.parseInt(JOptionPane.showInputDialog("Enter value for delete "));
					     llc.deleteOther(value);
					 	 break;
				default : JOptionPane.showMessageDialog(null, "Return to Main Menu","LinkList Program",JOptionPane.WARNING_MESSAGE);
			}
		}while(ch!=0);
	}

	}


