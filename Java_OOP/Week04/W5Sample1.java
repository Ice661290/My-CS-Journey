import javax.swing.JOptionPane;
class W5Sample1
{
  static Student S = new Student();
  static Faculty F = new Faculty();

  public static void main(String[] args)
  {
     S.setID("661290");
     S.setNAME("Thanatcha");
     S.setGPA(3.34);

     F.setFID("05");
     F.setFNAME("Science and Technology");

     JOptionPane.showMessageDialog(null, "Student ID : " + S.getID() 
		                            + "\nStudent Name: " + S.getNAME() 
		                            + "\nStudent GPA: " + S.getGPA() 
                                    + "\n-------------------" 
		                            + "\nFaculty ID: " + F.getFID() 
		                            + "\nFaculty Name : " + F.getFNAME());
  }
}
                          