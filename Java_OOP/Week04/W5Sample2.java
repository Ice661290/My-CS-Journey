import javax.swing.JOptionPane;
class W5Sample2
{
  static Student S = new Student();
  static Faculty F = new Faculty();

  public static void main(String[] args)
  {  
     String sid,sname,fid,fname,input;
	 double gpa;
	 sid = JOptionPane.showInputDialog("Enter Student ID");
	 sname = JOptionPane.showInputDialog("Enter Student Name");
	 input = JOptionPane.showInputDialog("Enter Student GPA");
	 gpa = Double.parseDouble(input);

	 fid = JOptionPane.showInputDialog("Enter Faculty ID");
	 fname = JOptionPane.showInputDialog("Enter Faculty Name ");

     S.setID(sid);
     S.setNAME(sname);
     S.setGPA(gpa);

     F.setFID(fid);
     F.setFNAME(fname);

     JOptionPane.showMessageDialog(null, "Student ID : " + S.getID() 
		                            + "\nStudent Name: " + S.getNAME() 
		                            + "\nStudent GPA: " + S.getGPA() 
                                    + "\n-------------------" 
		                            + "\nFaculty ID: " + F.getFID() 
		                            + "\nFaculty Name : " + F.getFNAME());
  }
}