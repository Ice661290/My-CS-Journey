import javax.swing.JOptionPane;
public class SampleW9 {
    static SampleW9 SP = new SampleW9();
    //ไม่ได้ใช้หรือจะใช้ก็ได้ static SampleW9 SP = new SampleW9();
    //ไม่ได้ใส่ static Shape S = new Shape(); เพราะมันเป็น abstarct class ไม่สามารถสร้างobjectได้โดยตรง
    //static Circle C = new Circle(10);  //10 - constructor

    //Override - methodของแม่กับลูกที่มีชื่อเดียวกัน แต่ภายในโครงสร้างหรือคำสั่งไม่เหมือนกัน
    
    public static void main(String[] args){
        int ch1;
    ch1=SP.menu();
    do{
        switch(ch1){
            case 1:SP.Circle();break;
            case 2:SP.Triangle();break;
            case 3:SP.Square();break;
            default : break;
    }ch1=SP.menu();
} while(ch1!=0);
}

public int menu(){
    int ch = Integer.parseInt(JOptionPane.showInputDialog("***Select Menu***"
                                                             + "\n 1.Circle"
                                                             + "\n 2.Triangle"
                                                             + "\n 3.Square"
                                                             + "\n 0.Exit"));
    return ch;
}    

public void Circle(){
    double r = Double.parseDouble(JOptionPane.showInputDialog("Enter Radius")); //int r = Integer.parseInt(JOptionPane.showInputDialog("Enter Radius")); 
        Circle C = new Circle(r);
        String output;
       output = "Area =" + C.calArea() + "\nPerimeter =" + C.calPerimeter();
       JOptionPane.showMessageDialog(null,output);
}
public void Triangle(){
    double b = Double.parseDouble(JOptionPane.showInputDialog("Enter base"));
    double h = Double.parseDouble(JOptionPane.showInputDialog("Enter height")); //int r = Integer.parseInt(JOptionPane.showInputDialog("Enter Radius")); 
        Triangle T = new Triangle(h,b);
        String output;
       output = "Area =" + T.calArea() + "\nPerimeter =" + T.calPerimeter();
       JOptionPane.showMessageDialog(null,output);
}
public void Square(){
    double s = Double.parseDouble(JOptionPane.showInputDialog("Enter Side")); //int r = Integer.parseInt(JOptionPane.showInputDialog("Enter Radius")); 
        Square S = new Square(s);
        String output;
       output = "Area =" + S.calArea() + "\nPerimeter =" + S.calPerimeter();
       JOptionPane.showMessageDialog(null,output);
}
        
       
}
    

