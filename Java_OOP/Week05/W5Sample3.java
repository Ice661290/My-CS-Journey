import javax.swing.JOptionPane;
class W5Sample3
{  static Student S = new Student();
   static Faculty F = new Faculty();
   static W5Sample3 SP = new W5Sample3();
   
   
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
      
      sid = JOptionPane.showInputDialog("Enter Student ID");
      sname = JOptionPane.showInputDialog("Enter Student Name");
      input = JOptionPane.showInputDialog("Enter Student GPA");
      gpa = Double.parseDouble(input);
      
      S.setID(sid);
      S.setNAME(sname);
      S.setGPA(gpa);
  }
  
  
  public void createFaculty(){
      String fid,fname;
      fid = JOptionPane.showInputDialog("Enter Faculty ID");
      fname = JOptionPane.showInputDialog("Enter Faculty Name");
      
      F.setFID(fid);
      F.setFNAME(fname);
  }
  
  
  public void showStudent(){
      JOptionPane.showMessageDialog(null,"Student ID: " + S.getID()
                                     + "\nStudent Name: " + S.getNAME()
                                     + "\nStudent GPA: " + S.getGPA()
                                     + "\n---------------------------");
  }
  
  
  public void showFaculty(){
      JOptionPane.showMessageDialog(null,"Faculty ID: " + F.getFID()
                                + "\nFaculty Name: " + F.getFNAME()
                                + "\n--------------------------");
  }
  }