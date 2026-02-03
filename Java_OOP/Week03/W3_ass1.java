import javax.swing.JOptionPane;
class W3_ass1
{
  public static void main(String[] args)
   {
      String name;
      name = JOptionPane.showInputDialog("Enter Name");
      
      double gpa;
      String inputStr = JOptionPane.showInputDialog("Enter GPA");
      gpa = Double.parseDouble(inputStr);

      int age;
       inputStr = JOptionPane.showInputDialog("Enter Age");
      age = Integer.parseInt(inputStr);

      JOptionPane.showMessageDialog(null,"My name is" + name
                                    +"\n My GPA =" + gpa + "\n My age =" + age);
    }
}