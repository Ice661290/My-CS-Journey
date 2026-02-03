import javax.swing.JOptionPane;

public class ArrayListClass {
   private int MaxSize;
   private int length;
   private int[] list;
	  
   
      public ArrayListClass() {
		// TODO Auto-generated constructor stub
    	  MaxSize = 10;
    	  length = 0;
    	  list = new int[MaxSize]; //สร้างเป็นarray
    	  for(int i =0; i<MaxSize; i++){
    		  list[i] = -1;//แต่ละช่องเก็บค่าเท่ากับ-1
    	  }
	}
      
      
       public ArrayListClass(int size){
    	   if(size<0){
    		   JOptionPane.showMessageDialog(null, "Size Error");
    		   MaxSize = 10;
    	   }else{
    		   MaxSize = size;
    	   }
    	   length = 0;
     	  list = new int[MaxSize]; //สร้างเป็นarray
     	  for(int i =0; i<MaxSize; i++){
     		  list[i] = -1;//แต่ละช่องเก็บค่าเท่ากับ-1
       }

       }
       
       
        public void clearList(){
        	for(int i=0; i<MaxSize; i++){
        		list[i] = -1;
        	}
        	length = 0;
        }
        
        
        public boolean isEmpty(){
        	return (length == 0);
        }
        public boolean isFull(){
        	return (length == MaxSize);
        }
        
        
        public int listSize(){
        	return length;
        }
        
     //Submenu_insert   
        public void insertAt(int location, int insertItem){
        	if(location < 0 || location >= length){
        		JOptionPane.showMessageDialog(null, "Position Error");
        	}else{
        		if(isFull()){
        			JOptionPane.showMessageDialog(null, "List Full");
        		}else{
        			for(int i=length; i>location; i--){
        				list[i] = list[i-1];
        			}
        			list[location] = insertItem;
        			length++;
        		}
        		
        	}
        }
        public void insertEnd(int insertItem){
        	if(isFull()){
        		JOptionPane.showMessageDialog(null, "List Full");
        	}else{
        		list[length++] = insertItem; //++ รอบแรกเป็นค่าเดิม รอบถัดไปเป็นค่าใหม่
        	}
        }
        public void insert(int insertItem){
        	int loc;
        	if(isEmpty()){
        		list[length++] = insertItem;
        	}else {
        		if(isFull()){
        			JOptionPane.showMessageDialog(null, "List Full");
        		}else{
        			loc = seqSearch(insertItem);
        			if(loc == -1){
        				list[length++] = insertItem;
        			}else {
        				JOptionPane.showMessageDialog(null, "Duplicate Item");
        			}
        		}
        	}
        }
        
      //Submenu_remove
        public void removeAt(int location){
        	if(location < 0 || location >= length){
        		JOptionPane.showMessageDialog(null, "Position Error");
        	}else{
        		if(isEmpty()){
        			JOptionPane.showMessageDialog(null, "No Delete");
        		}else{
        			for(int i=location; i<length-1; i++){
        				list[i] = list[i+1];
        			}
        			list[length-1] = -1; //เราเก็บค่าลบ1 เพราะมันไม่มีค่า
        			length--;
        		}
        	}
        }
        public void remove(int removeItem){
        	int loc;
        	if(isEmpty())
        		JOptionPane.showMessageDialog(null, "No Delete");
        	else {
        		loc =seqSearch(removeItem);
        		if(loc==-1)
        			JOptionPane.showMessageDialog(null, "No Delete");
        		else{
        			removeAt(loc);
        		}
        	}
        }
        
      //Replace
        public void replaceAt(int location, int repItem){
        	if(location < 0 || location >= length){
        		JOptionPane.showMessageDialog(null, "Position Error");
        	}else{
        		list[location] = repItem;
        	}
        }
      //Search  
        public int retrieveAt(int location){
        	if(location < 0 || location >= length){
        		JOptionPane.showMessageDialog(null, "Position Error");
        		return -1;
        	}else{
        		return list[location];
        	}
        }
        public int seqSearch(int searchItem){
        	int loc;
        	boolean found = false;
        	for(loc =0; loc<length; loc++){
        		if(list[loc]==searchItem){
        			found = true;
        			break;
        		}
        	}
        	if(found)
        		return loc;
        	else
        		return -1;
        }
      //Submenu_print  
        public void printAll(){
        	String output = "Show Detail of List All\n";
        	  for(int i=0; i<MaxSize; i++){
        		  output += "list["+i+"] = " +list[i] +"\n";
        	  }
        	  JOptionPane.showMessageDialog(null, output);
        }
        public void printValue(){
        	String output = "Show List of length\n";
      	  for(int i=0; i<length; i++){
      		  output += "list["+i+"] = " +list[i] +"\n";
      	  }
      	  JOptionPane.showMessageDialog(null, output);
        }
}
