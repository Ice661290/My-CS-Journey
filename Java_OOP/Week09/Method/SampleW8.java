import javax.swing.JOptionPane;
public class SampleW8 {
    static final int size = 3;
   static Student [] S = new Student[size];
   static Faculty [] F = new Faculty[size];
   static Teacher [] T = new Teacher[size];
   static SampleW8 SP = new SampleW8(); //call this "Default Constructor" because it create itself if we create constructor by myself it wiill call "constructor" and delete a deaulf constructor "
   static int counts=0, countF=0, countT=0;


public static void main(String[] args){
    int ch1;
    ch1=SP.menu();
    do{
        switch(ch1){
            case 1: SP.createStudent();break;
            case 2: SP.createFaculty();break;
            case 3: SP.createTeacher();break;
            case 4: SP.showStudent();break;
            case 5: SP.showFaculty();break;
            case 6: SP.showTeacher();break;
            case 7: SP.searchStudent();break;     //* new */
            case 8: SP.searchTeacher();break;     //* new exercise */
            default : break;
    }
    ch1=SP.menu();

} while(ch1!=0);
}

public int menu(){
    int ch = Integer.parseInt(JOptionPane.showInputDialog("***Select Menu***"
                                                            + "\n 1.Create Student"
                                                            + "\n 2.Create Faculty"
                                                            + "\n 3.Create Teacher"
                                                            + "\n 4.Show Student"
                                                            + "\n 5.Show Faculty"
                                                            + "\n 6.Show Teacher"
                                                            + "\n 7.Search Student"   //*new */
                                                            + "\n 8.Search Teacher"   //*new exercise */
                                                            + "\n 0.Exit"));
    return ch;    
}


//new
public void searchStudent(){  //Linear Search   //(new)
    boolean found = false;  //int found = 0 ใช้อันนี้ก็ได้ (found-ไว้สำหรับcheck)
    String id = JOptionPane.showInputDialog("Enter Student ID for Search");
     for(int i=0; i<counts && found == false;i++){   
        if(S[i].getID().equals(id)){   //=ไม่ใช้ เพราะเป็นการเปรียบเทียบ
            found =true;
            SP.showStudent(i);
        }//end if
     }//end for
     if(found==false)
      JOptionPane.showMessageDialog(null,"Not Found ID");
}//end search

public void showStudent(int pos){   //overload method - ชื่อเหมือนกันแต่paraต่างกัน จึงไม่ใช่ตัวเดียวกัน  //(new)
    String output = "*****Found Student Data*****";
      
          output += "\nStudent ID : " + S[pos].getID();
          output += "\nStudent Name: " + S[pos].getNAME();
          output += "\nStudent GPA: " + S[pos].getGPA();
          output += "\nFaculty: " + S[pos].getFAC().getFNAME();
          output += "\n--------------------------------";
      
   JOptionPane.showMessageDialog(null,output);      //null คือ  parameterที่มีการส่งค่ากลับ
}
public void showStudent(){   //overload method - ชื่อเหมือนกันแต่paraต่างกัน จึงไม่ใช่ตัวเดียวกัน
    String output = "*****Student Data*****";
      for(int i = 0;i<counts; i++){
          output += "\nStudent ID : " + S[i].getID();
          output += "\nStudent Name: " + S[i].getNAME();
          output += "\nStudent GPA: " + S[i].getGPA();
          output += "\nFaculty: " + S[i].getFAC().getFNAME();
          output += "\n--------------------------------";
      }
   JOptionPane.showMessageDialog(null,output);      //null คือ  parameterที่มีการส่งค่ากลับ
}


//new
public void searchTeacher(){  //Linear Search    //(new exercise)
    boolean found = false;  //int found = 0  found-ไว้สำหรับcheck
    String id = JOptionPane.showInputDialog("Enter Teacher ID for Search");
     for(int i=0; i<countT && found == false;i++){   
        if(T[i].getID().equals(id)){   //=ไม่ใช้ เพราะเป็นการเปรียบเทียบ
            found =true;
            SP.showTeacher(i);
        }//end if
     }//end for
     if(found==false)
      JOptionPane.showMessageDialog(null,"Not Found ID");
}//end search
public void showTeacher(int pos){             //(new exercise)
    String output = "*****Found Teacher Data*****";
      
          output += "\nTeacher ID : " + T[pos].getID();
          output += "\nTeacher Name: " + T[pos].getNAME();
          output += "\nTeacher Salary: " + T[pos].getSALARY();
          output += "\nFaculty: " + T[pos].getFAC().getFNAME();
          output += "\n--------------------------------";
      
   JOptionPane.showMessageDialog(null,output);      //null คือ  parameterที่มีการส่งค่ากลับ
}

public void showTeacher(){
    String output = "*****Teacher Data*****";
      for(int i = 0;i<counts; i++){
          output += "\nTeacher ID : " + T[i].getID();
          output += "\nTeacher Name: " + T[i].getNAME();
          output += "\nTeacher Salary: " + T[i].getSALARY();
          output += "\nFaculty: " + T[i].getFAC().getFNAME();
          output += "\n--------------------------------";
      }
   JOptionPane.showMessageDialog(null,output);      //null คือ  parameterที่มีการส่งค่ากลับ
}
 


public void createStudent(){
    String id,name,input;
    double gpa;
    int i;
    
    id = JOptionPane.showInputDialog("Enter Student ID");
    name = JOptionPane.showInputDialog("Enter Student Name");
    input = JOptionPane.showInputDialog("Enter Student GPA");
    gpa = Double.parseDouble(input);
    i = SP.selectFaculty();
    
    S[counts] = new Student(id,name,gpa,F[i]);     //สร้างobjectให้กับstudent  //ระวังนะถ้าconstructorกับไอคำสั่งตรงห้องนี้มันสลับที่กันหรือตัวกำหนดค่าต่างกัน
    counts++;
}

public void createTeacher(){
    String id,name,input;
    double salary;
    int i;
    
    id = JOptionPane.showInputDialog("Enter Teacher ID");
    name = JOptionPane.showInputDialog("Enter Taecher Name");
    input = JOptionPane.showInputDialog("Enter Teacher Salary");
    salary = Double.parseDouble(input);
    i = SP.selectFaculty();
    
    T[countT] = new Teacher(id,name,salary,F[i]);     //สร้างobjectให้กับteacher  //ระวังนะถ้าconstructorกับไอคำสั่งตรงห้องนี้มันสลับที่กันหรือตัวกำหนดค่าต่างกัน
    countT++;
}

public int selectFaculty(){
    int f;
    String output="**Select Faculty**";
    for(int i=0;i<countF;i++){
        output += "\n No.: " + i ;
        output += "\n Faculty ID: " + F[i].getFID();
        output += "\n Faculty Name: " + F[i].getFNAME();
    }
    f=Integer.parseInt(JOptionPane.showInputDialog(output));
    return f;
  }

public void createFaculty(){
    String fid,fname;
    fid = JOptionPane.showInputDialog("Enter Faculty ID");
    fname = JOptionPane.showInputDialog("Enter Faculty Name");
    
    F[countF] = new Faculty(fid,fname);           //สร้างobjectให้กับFaculty   //ระวังนะถ้าconstructorกับไอคำสั่งตรงห้องนี้มันสลับที่กันหรือตัวกำหนดค่าต่างกัน
    countF++;
}

public void showFaculty(){
    String output = "*****Faculty Data*****"; 
     for(int i = 0;i<countF;i++){
      output += "\nFaculty ID: " + F[i].getFID();
      output += "\nFaculty Name: " + F[i].getFNAME();
      output += "\n--------------------------";
     }JOptionPane.showMessageDialog(null,output);
}
}




