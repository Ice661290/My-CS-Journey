import javax.swing.JOptionPane;

public class LinkedListClass {
      private LinkedListNode first,last; //reference variable
      private int count;
      
	public LinkedListClass() {
	   first = null;
	   last = null;
	   count = 0;
	}
	
  //initialize
	public void initializeList(){
		first =null;
		last = null;
		   count = 0;
	}
	
  //Check Empty	
	public boolean isEmptyList(){
		return (first==null);
	}
	
  //Find item	
	public int findNumber(){
		return count;
	}
	
  //Retrieve data in first node
	public int front(){
	  if(isEmptyList())
		  return -1;
	  else
		return (first.info);
	}
	
	//Retrieve data in last node
	 public int back(){
		 if(isEmptyList())
			 return -1;
	     else
	    	 return (last.info);
		 
	 }
	 
	 
	//SubMenu building
	 //Forward Building
	  public void forwardList(){
		  LinkedListNode newNode;
		  int num;
		  num = Integer.parseInt(JOptionPane.showInputDialog("Enter number "));
		  while(num!=-999){
			  newNode = new LinkedListNode();
			  newNode.info = num;
			  newNode.link = null;
			   if(first==null){
				   first = newNode;
				   last = newNode;
				 //count++;
			   }else{
				   last.link = newNode;
				   last = newNode;
				   //count++;
			   }
			   count++;
			   num = Integer.parseInt(JOptionPane.showInputDialog("Enter number" ));
		  }
		   
	  }
	  
	  //Backward Building
	   public void backwardList(){
		  LinkedListNode newNode;
		  int num;
		  num = Integer.parseInt(JOptionPane.showInputDialog("Enter number "));
		  while(num!=-999){
			  newNode = new LinkedListNode();
			  newNode.info = num;
			  newNode.link = null;
			   if(first==null){
				   first = newNode;
				   last = newNode;
				 //count++;
			   }else{
				   newNode.link = first;
				   first = newNode;
				 //count++; 
			   }
			   count++;
			   num = Integer.parseInt(JOptionPane.showInputDialog("Enter number" ));
		  }
	  }
	   
	//Search list
	   public void searchList(int searchItem){
		   LinkedListNode current;
		   boolean check = false;
		   current = first;
		   
		   while((!check)&&(current!=null)){
			   if(current.info == searchItem)
				   check = true;
			   else
				   current = current.link;
		   }
		   if(check)
			   JOptionPane.showMessageDialog(null, "Found");
		   else
			   JOptionPane.showMessageDialog(null, "Not Found");
	   }
	  
	//Print list
	  public void printList(){
		  String output = "Print All list\n";
		  LinkedListNode current;
		  current = first;
		  
		  while(current!=null){
             output += current.info + " ==> ";
             current = current.link; 
		  }
		  JOptionPane.showMessageDialog(null,output);
	  }
	 
//SunMenu Insert	  
//Insert First
	  public void insertFirst(int insertItem){
		  LinkedListNode newNode;
		 
			  newNode = new LinkedListNode();
			  newNode.info = insertItem;
			  newNode.link = null;
			   if(first==null){
				   first = newNode;
				   last = newNode;
				 
			   }else{
				   newNode.link = first;
				   first = newNode;
				 //count++; 
			   }
			   count++;
			 
		  }
	  
	//Insert Last
	  public void insertLast(int insertItem){
		  LinkedListNode newNode;
		 
			  newNode = new LinkedListNode();
			  newNode.info = insertItem;
			  newNode.link = null;
			   if(first==null){
				   first = newNode;
				   last = newNode;
				 
			   }else{
				   last.link = newNode;
				   last = newNode;
			   }
			   count++;
			   
		  }
	  
	  //Insert
	  public void insertOther(int num, int loc){
		  LinkedListNode newNode,current;
		  newNode = new LinkedListNode();
		  newNode.info = num;
		  newNode.link = null;
		  if((loc<0)||(loc>count)){
			  JOptionPane.showMessageDialog(null, "Location Error");
		  }else if(loc==0){
			  if(first==null){
				  first = newNode;
				  last = newNode;
				 count++;
			  }else{
				  JOptionPane.showMessageDialog(null, "Location Error");
			  }
		  }else {
			  int i = 1;
			  current = first;
			  while(i<loc){
				  current = current.link;
				  i++;
			  }
			  newNode.link = current.link;
			  current.link = newNode;
			  if(current==last){
				  last = newNode;
				 //count++;
			  }
			  count++;
		  }
		 }
	  
	  
	//SubMenu Delete
	  //Delete First
	    public void deleteFirst(){
	    	LinkedListNode q;
	    	if(first==null){
	    		JOptionPane.showMessageDialog(null, "No Delete");
	    	}else{
	    		JOptionPane.showMessageDialog(null, "Delete Value" + first.info);
	    		
	    		if(first == last){
	    			first = null;
	    			last = null;
	    		}else{
	    			q = first;
	    			first = first.link;
	    			q = null;
	    		}
	    		count--;
	    	}
	    }
	    
	  //Delete Last
	    public void deleteLast(){
	    	LinkedListNode p,q;
	    	if(first==null){
	    		JOptionPane.showMessageDialog(null, "No Delete");
	    	}else{
	    		JOptionPane.showMessageDialog(null, "Delete Value" + last.info);
	    		
	    		if(first == last){
	    			first = null;
	    			last = null;
	    		}else{
	    			q = first;
	    			p = null;
	    			 while(q!=last){
	    				 p = q;
	    				 q = q.link;
	    			 }
	    			 p.link = q.link;  //p.link = q.link p.link=|ar.link p.link = null
	    			 last = p;
	    			 q = null;
	    }
	    		count--;
	  }
	    }
	    
	    //Delete Other
	    public void deleteOther(int value){
	    	LinkedListNode p,q;
	    	if(first==null){
	    		JOptionPane.showMessageDialog(null, "No Delete");
	    	}else{
	    		q = first;
	    		p = null;
	    		boolean check = false;
	    		 if(q.info == value){
	    			 check = true;
	    			 JOptionPane.showMessageDialog(null, "Delete Value" + q.info);
	    			 if(first==last){
	    				 first = null;
	    				 last = null;
	    			 }else{
	    				 first = first.link;
	    				 q = null;
	    			 }
	    		 }else{
	    			 while((!check)&&(q!=null)){
	    				 if(q.info == value){
	    					 check = true;
	    					 JOptionPane.showMessageDialog(null, "Delete Value" + q.info);
	    					 p.link = q.link;
	    					  if(q==last)
	    						  last = p;
	    					  q = null;
	    				 }else{
	    					 p = q;
	    					 q = q.link;
	    				 }
	    			 }
	    		 }
	      	      if(check == false)
	      	    	  JOptionPane.showMessageDialog(null, "No value");
	    }//else if
}//method
}

