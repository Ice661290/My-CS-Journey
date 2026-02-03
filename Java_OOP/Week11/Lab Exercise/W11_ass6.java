import javax.swing.JOptionPane;
public class W11_ass6 {
    static int Arr[][] = new int[3][3];  //Array 2D (3*3) int[row][colum]
    static W11_ass6 W = new W11_ass6();

public static void main(String[] args){
    int ch;
    ch=W.menu();
    do{
        switch(ch){
            case 1: W.inputArray(); break;
            case 2: W.outputArray(); break;
            case 3: W.sumAllArray(); break;
            case 4: W.sumByRow(); break;
            case 5: W.sumByCol(); break;
            case 6: System.exit(0); break;
            default : break;
        }
        ch = W.menu();
    }while(ch!=6);
    
}

public int menu(){
    int ch = Integer.parseInt(JOptionPane.showInputDialog("***Select Menu***"
                                                           + "\n 1. Input Array"
                                                           + "\n 2. Output Array"
                                                           + "\n 3. Sum All Array"
                                                           + "\n 4. Sum by Row"
                                                           + "\n 5. Sum by Column"
                                                           + "\n 6. Exit"));
    return ch;
}


//ใส่ข้อมูลลงในarray
public void inputArray(){
    for(int row=0; row<Arr.length; row++){     //ความยาว = 3
      for(int col=0; col<Arr[row].length;col++){
        Arr[row][col] = Integer.parseInt(JOptionPane.showInputDialog("Enter Amount:"));
      }
    }
}


//แสดงข้อมูลลงในarray
public void outputArray(){
    String output = "Show 2D Array\n";
    for(int row=0; row<Arr.length; row++){     
      for(int col=0; col<Arr[row].length;col++){
        output += Arr[row][col] + "\t";                
      }
      output += "\n";
}
   JOptionPane.showMessageDialog(null,output);
}


//รวมข้อมูลในarrayทั้งหมด
public void sumAllArray(){
    int sum=0;
    for(int row=0; row<Arr.length; row++){     
      for(int col=0; col<Arr[row].length;col++){
        sum += Arr[row][col];               
      }
}
   JOptionPane.showMessageDialog(null,"sum all array =" + sum);
}


//เอาข้อมูลในrow(แถว)มารวมกัน
public void sumByRow(){
    int sum=0;
    int row = Integer.parseInt(JOptionPane.showInputDialog("Enter Row:"));
         
      for(int col=0; col<Arr[row].length;col++){
        sum += Arr[row][col];               
      }

   JOptionPane.showMessageDialog(null,"sum all array ="+ row +" = " + sum);
}


//เอาข้อมูลในcolum(คอล์ม)มารวมกัน
public void sumByCol(){
    int sum=0;
    int col = Integer.parseInt(JOptionPane.showInputDialog("Enter Colum:"));
         
    for(int row=0; row<Arr.length; row++){
        sum += Arr[row][col];               
      }

   JOptionPane.showMessageDialog(null,"sum all array ="+ col +" = " + sum);
}

}



