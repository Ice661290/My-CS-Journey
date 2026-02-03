import javax.swing.JOptionPane;
public class HW_Week11 {
    static int Student[][] = new int[4][2];  //int[5][3]
    static HW_Week11 W = new HW_Week11();

public static void main(String[] args){
    int ch;
    ch=W.menu();
    do{
        switch(ch){
            case 1: W.inputStudent(); break;   //inputStudent(Student)
            case 2: W.ShowAllStudent(); break;  //SumAllStudent(Student)
            case 3: W.SumAllStudent(); break;  //ShowAllStudent(Student)
            case 4: W.SumByCurriculum(); break;       //SumByCurriculum
            case 5: W.SumByYear(); break;          //SumByYear
            case 6: System.exit(0); break;
            default : break;
        }
        ch = W.menu();
    }while(ch!=6);
    
}

public int menu(){
    int ch = Integer.parseInt(JOptionPane.showInputDialog("***Select Menu***"
                                                           + "\n 1. Input Student"
                                                           + "\n 2. Output Student"
                                                           + "\n 3. Sum All Student"
                                                           + "\n 4. Sum by Curriculum"
                                                           + "\n 5. Sum by Year"
                                                           + "\n 6. Exit"));
    return ch;
}


//ใส่ข้อมูลลงในarray
public void inputStudent(){
    for(int row=0; row<Student.length; row++){        //int row=1
      for(int col=0; col<Student[row].length;col++){     //int col=1
        Student[row][col] = Integer.parseInt(JOptionPane.showInputDialog("Enter Student Amount:"));
      }
    }
}


//แสดงข้อมูลลงในarray
public void ShowAllStudent(){
    String output = "Show Student\n";
    for(int row=0; row<Student.length; row++){       //int row=1
      for(int col=0; col<Student[row].length;col++){   //int col=1
        output += Student[row][col] + " ";                
      }
      output += "\n";
}
   JOptionPane.showMessageDialog(null,output);
}


//รวมข้อมูลในarrayทั้งหมด
public void SumAllStudent(){
    int sum=0;
    for(int row=0; row<Student.length; row++){      //int row=1
      for(int col=0; col<Student[row].length;col++){    //int col=1
        sum += Student[row][col];               
      }
}
   JOptionPane.showMessageDialog(null,"All Student =" + sum);
}


//เอาข้อมูลในrow(แถว)มารวมกัน
public void SumByYear(){
    int sum=0;
    int row = Integer.parseInt(JOptionPane.showInputDialog("Enter Year:"));
         
      for(int col=0; col<Student[row].length;col++){   //int col=1
        sum += Student[row][col];               
      }

   JOptionPane.showMessageDialog(null,"Year "+ row +" = " + sum);
}


//เอาข้อมูลในcolum(คอล์ม)มารวมกัน
public void SumByCurriculum(){
    int sum=0;
    int col = Integer.parseInt(JOptionPane.showInputDialog("Enter Curriculum:"));
         
    for(int row=0; row<Student.length; row++){ //int row=1
        sum += Student[row][col];               
      }

   JOptionPane.showMessageDialog(null,"Curriculum "+ col +" = " + sum);
}

}



