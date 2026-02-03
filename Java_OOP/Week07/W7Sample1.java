import javax.swing.JOptionPane;
class W7Sample1
{  static final int size = 3;
   static Student [] S = new Student[size];   //สร้างarrayให้กับstudent
   static Faculty [] F = new Faculty[size];   //สร้างarrayให้กับfaculty
   static W7Sample1 SP = new W7Sample1();
   static int counts=0, countF=0;             //สร้างไว้นับarrayที่เท่าไหร่ให้กับstudent,Faculty
   
   
  public static void main (String[] args)
  {   int ch1;
      ch1 = SP.menu();
      do{
          switch(ch1){
              case 1: SP.createStudent();break;
              case 2: SP.createFaculty();break;
              case 3: SP.showStudent();break;
              case 4: SP.showFaculty();break;
              default : break;
          }
          ch1 = SP.menu();
      }while(ch1!=0);
  } 
  
  
  public int menu(){
      int ch = Integer.parseInt(JOptionPane.showInputDialog("***Select Menu***"
                                                              + "\n 1.Create Student"
                                                              + "\n 2.Create Faculty"
                                                              + "\n 3.Show Student"
                                                              + "\n 4.Show Faculty"
                                                              + "\n 0.Exit"));
      return ch;    
  }
  
  
  public void createStudent(){
      String sid,sname,input;
      double gpa;
      int i;
      
      sid = JOptionPane.showInputDialog("Enter Student ID");
      sname = JOptionPane.showInputDialog("Enter Student Name");
      input = JOptionPane.showInputDialog("Enter Student GPA");
      gpa = Double.parseDouble(input);
      i = SP.selectFaculty();
      
      S[counts] = new Student(sid,sname,gpa,F[i]);     //สร้างobjectให้กับstudent  //ระวังนะถ้าconstructorกับไอคำสั่งตรงห้องนี้มันสลับที่กันหรือตัวกำหนดค่าต่างกัน
      counts++;
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
  
  
  public void showStudent(){
      String output = "*****Student Data*****";
        for(int i = 0;i<counts; i++){
            output += "\nStudent ID : " + S[i].getID();
            output += "\nStudent Name: " + S[i].getNAME();
            output += "\nStudent GPA: " + S[i].getGPA();
            output += "\nFaculty: " + S[i].getFac().getFNAME();
            output += "\n--------------------------------";
        }
     JOptionPane.showMessageDialog(null,output);      //null คือ  parameterที่มีการส่งค่ากลับ
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