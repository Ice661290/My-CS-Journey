import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Kero extends Frame {

  public void paint(Graphics g) {
     Graphics2D ga = (Graphics2D)g;
     setBackground(Color.GRAY);
     GradientPaint gp = new GradientPaint(
          20f,
          20f,
          Color.yellow,
          380f,
          280f,
          Color.green); 
  //   ga.setPaint(Color.blue);
     ga.setPaint(gp);
     ga.fillOval(150,150,400,400);
  
           
    
     ga.setPaint(Color.white);
     ga.fillOval(175,100,180,180);
     ga.setPaint(Color.black);
     ga.fillOval(250,180,90,90);
     ga.setPaint(Color.PINK);
     ga.fillOval(160,300,90,90);

     
     ga.setPaint(Color.white);
     ga.fillOval(350,100,180,180);
     ga.setPaint(Color.black);
     ga.fillOval(360,180,90,90);

     ga.setPaint(Color.PINK);
     ga.fillOval(450,300,90,90);

     ga.setPaint(Color.white);
     ga.fillOval(250,400,220,100);
      
     ga.setPaint(Color.red);
     ga.fillOval(280,440,150,60);


  }
              
  public static void main(String args[]) 
  {
      Kero frame = new Kero();       
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