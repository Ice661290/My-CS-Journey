import javax.swing.JOptionPane;

public class Main_Menu {
   static Main_Menu M = new Main_Menu();
   static ArrayListClass alc = new ArrayListClass();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M.menu();

	}
	
	public void menu(){
		int ch;
		  
		  do{
			  ch=Integer.parseInt(JOptionPane.showInputDialog(
					                                "###############"
                                                  + "\n # Main Menu #"
                                                  + "\n###############"
                                                  + "\n1. Initialization"
                                                  + "\n2. Show empty list"
                                                  + "\n3. Show full list"
                                                  + "\n4. Find size of list"
                                                  + "\n5. Insert Item"
                                                  + "\n6. Remove Item"
                                                  + "\n7. Replace Item"
                                                  + "\n8. Search Item"
                                                  + "\n9. Print List"
                                                  + "\n0. Exit"
                                                  + "\n###############"
                                                  + "\nSelect to choice number :"));
			switch(ch){
				case 1: alc.clearList();  
				        break;
				case 2: if(alc.isEmpty())
					         JOptionPane.showMessageDialog(null, "List is Empty");
					    else
					    	JOptionPane.showMessageDialog(null, "List is not Empty");break;
				case 3: if(alc.isFull())
					        JOptionPane.showMessageDialog(null, "List is Full");
				        else
				        	JOptionPane.showMessageDialog(null, "List is not Full");break;
				case 4: JOptionPane.showMessageDialog(null, "Length of list is " + alc.listSize());
				        break;
				case 5:M.submenu_insert();break;
				case 6:M.submenu_remove();break;
				case 7: int location = Integer.parseInt(JOptionPane.showInputDialog("Enter location:"));
				        int repItem = Integer.parseInt(JOptionPane.showInputDialog("Enter Replace Item:"));
				        alc.replaceAt(location, repItem);
				        break;
				case 8:M.submenu_search();break;
				case 9:M.submenu_print();break;
					default : JOptionPane.showMessageDialog(null, "Program Exit");
			}
		  }while(ch != 0);
	}


public void submenu_insert(){
	int ch;
	  
	  do{
		  ch=Integer.parseInt(JOptionPane.showInputDialog(
				                                "###############"
                                              + "\n # SubMenu Insert #"
                                              + "\n###############"
                                              + "\n1. Insert to location"
                                              + "\n2. Insert to end"
                                              + "\n3. Insert unique"
                                              + "\n0. retrun to main"
                                              + "\n###############"
                                              + "\nSelect to choice number :"));
		switch(ch){
			case 1: int location = Integer.parseInt(JOptionPane.showInputDialog("Enter location:"));
			        int insertItem = Integer.parseInt(JOptionPane.showInputDialog("Enter insertitem:"));
			        alc.insertAt(location,insertItem);
			        break;
			case 2: int insertItem1 = Integer.parseInt(JOptionPane.showInputDialog("Enter insertitem:"));
			        alc.insertEnd(insertItem1);
				    break;
			case 3: int insertItem2 = Integer.parseInt(JOptionPane.showInputDialog("Enter insertitem:"));
			        alc.insert(insertItem2);
				    break;
			default : JOptionPane.showMessageDialog(null, "Return to lobby");
		}
	  }while(ch != 0);
}




public void submenu_remove(){
	int ch;
	  
	  do{
		  ch=Integer.parseInt(JOptionPane.showInputDialog(
				                                "###############"
                                              + "\n # SubMenu Remove #"
                                              + "\n###############"
                                              + "\n1. Remove at location"
                                              + "\n2. Remove by key value"
                                              + "\n0. retrun to main"
                                              + "\n###############"
                                              + "\nSelect to choice number :"));
		switch(ch){
			case 1:  int location = Integer.parseInt(JOptionPane.showInputDialog("Enter location: "));
			         alc.removeAt(location);
			         break;
			case 2:  int removeItem = Integer.parseInt(JOptionPane.showInputDialog("Enter removeitem"));
			         alc.remove(removeItem);
			         break;
			default : JOptionPane.showMessageDialog(null, "Return to lobby");
		}
	  }while(ch != 0);
}




public void submenu_search(){
	int ch;
	  
	  do{
		  ch=Integer.parseInt(JOptionPane.showInputDialog(
				                                "###############"
                                              + "\n # SubMenu Search #"
                                              + "\n###############"
                                              + "\n1. Search by location (Retrieve)"
                                              + "\n2. Search by key value"
                                              + "\n0. retrun to main"
                                              + "\n###############"
                                              + "\nSelect to choice number :"));
		switch(ch){
			case 1: int location = Integer.parseInt(JOptionPane.showInputDialog("Enter lo:"));
			        if(alc.retrieveAt(location)==-1)
			        	JOptionPane.showMessageDialog(null, "Position Eror,No Retrieve");
			        else
			        	JOptionPane.showMessageDialog(null, "Value is : " + alc.retrieveAt(location));
			        break;
			case 2: int searchItem = Integer.parseInt(JOptionPane.showInputDialog("Enter Search Item:"));
			        if(alc.seqSearch(searchItem)==-1){
			        	JOptionPane.showMessageDialog(null,"Not found");
			        }else{
			        	JOptionPane.showMessageDialog(null, "Found At Position: " + alc.seqSearch(searchItem));
			        }
			        break;
			default : JOptionPane.showMessageDialog(null, "Return to lobby");
		}
	  }while(ch != 0);
}




public void submenu_print(){
	int ch;
	  
	  do{
		  ch=Integer.parseInt(JOptionPane.showInputDialog(
				                                "###############"
                                              + "\n # SubMenu Search #"
                                              + "\n###############"
                                              + "\n1. Print All"
                                              + "\n2. Print value"
                                              + "\n0. retrun to main"
                                              + "\n###############"
                                              + "\nSelect to choice number :"));
		switch(ch){
			case 1: alc.printAll();
			        break;
			case 2: alc.printValue();
			        break;
			default : JOptionPane.showMessageDialog(null, "Return to lobby");
		}
	  }while(ch != 0);
}

}
