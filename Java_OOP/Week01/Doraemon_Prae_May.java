import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Doraemon_Prae_May extends Frame {

  public void paint(Graphics g) {
     Graphics2D ga = (Graphics2D)g;
     setBackground(Color.GRAY);
   
  //skin
  ga.setPaint(Color.black);
     ga.fillOval(90,70,517,517);
     ga.setPaint(Color.blue);
     ga.fillOval(95,75,507,507);
     ga.setPaint(Color.white);
     ga.fillOval(135,160,430,425);

 //eye L
     ga.setPaint(Color.black);
     ga.fillOval(195,95,160,190);
     ga.setPaint(Color.white);
     ga.fillOval(200,100,150,180);
 ga.setPaint(Color.black);
     ga.fillOval(270,160,50,70);
 ga.setPaint(Color.white);
     ga.fillOval(285,170,30,50);

 
 //bell
 ga.setPaint(Color.black);
     ga.fillOval(227,558,255,35);
     ga.setPaint(Color.red);
     ga.fillOval(230,560,250,30);
     ga.setPaint(Color.black);
     ga.fillOval(315,525,90,90);
     ga.setPaint(Color.yellow);
     ga.fillOval(320,530,80,80);
     

 //eye R
     ga.setPaint(Color.black);
     ga.fillOval(345,95,160,190);
     ga.setPaint(Color.white);
     ga.fillOval(350,100,150,180);
     ga.setPaint(Color.black);
     ga.fillOval(380,160,50,70);
      ga.setPaint(Color.white);
     ga.fillOval(385,170,30,50);


 //line L
 ga.setPaint(Color.black);
   g.drawLine(300, 300, 50, 200);
 g.drawLine(300, 330, 50, 330);
 g.drawLine(300, 360, 50, 460);

 //line R
   g.drawLine(600, 200, 400, 300);
 g.drawLine(600, 330, 400, 330);
 g.drawLine(600, 460, 400, 360);
       

 //nose
 ga.setPaint(Color.black);
     ga.fillOval(310,195,90,90);
 ga.setPaint(Color.black);
     ga.fillOval(350,275,8,130);
     ga.setPaint(Color.red);
     ga.fillOval(315,200,80,80);
 

 //lip
 ga.setPaint(Color.black);
     ga.fillOval(315,395,80,110);
     ga.setPaint(Color.orange);
     ga.fillOval(320,400,70,100);
     ga.setPaint(Color.red);
     ga.fillOval(325,440,60,60);

  }
             
  public static void main(String args[])
  {
    Doraemon_Prae_May frame = new Doraemon_Prae_May();      
      frame.addWindowListener(
      new WindowAdapter()
      {
         public void windowClosing(WindowEvent we)
         {
            System.exit(0);
         }
      }
      );
           
      frame.setSize(800, 800);
      frame.setVisible(true);
   }
}