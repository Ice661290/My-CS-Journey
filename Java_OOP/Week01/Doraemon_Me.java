import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Doraemon_Me extends Frame {

  public void paint(Graphics g) {
     Graphics2D ga = (Graphics2D)g;
     setBackground(Color.GRAY);
   
  //skin
     ga.setPaint(Color.blue);
     ga.fillOval(95,75,507,507);
     ga.setPaint(Color.white);
     ga.fillOval(130,140,440,440);

 //eye r
     ga.setPaint(Color.black);
     ga.fillOval(175,100,190,190);
     ga.setPaint(Color.white);
     ga.fillOval(175,100,180,180);
 ga.setPaint(Color.black);
     ga.fillOval(240,180,90,90);

 //line3 r
     ga.setPaint(Color.black);
     ga.fillOval(155,300,90,10);
     ga.setPaint(Color.black);
     ga.fillOval(160,330,90,10);
     ga.setPaint(Color.black);
     ga.fillOval(160,360,90,10);

 //nose
     ga.setPaint(Color.red);
     ga.fillOval(325,300,60,60);

 //bell
     ga.setPaint(Color.black);
     ga.fillOval(315,530,85,85);
     ga.setPaint(Color.yellow);
     ga.fillOval(320,530,80,80);

 //eye L
     ga.setPaint(Color.black);
     ga.fillOval(355,100,190,190);
     ga.setPaint(Color.white);
     ga.fillOval(350,100,180,180);
     ga.setPaint(Color.black);
     ga.fillOval(370,180,90,90);

 //line3 L
     ga.setPaint(Color.black);
     ga.fillOval(450,300,90,7);
     ga.setPaint(Color.black);
     ga.fillOval(450,330,90,7);
     ga.setPaint(Color.black);
     ga.fillOval(450,360,120,7);

 //lip
     ga.setPaint(Color.orange);
     ga.fillOval(250,400,220,100);
     ga.setPaint(Color.red);
     ga.fillOval(280,440,150,60);

  }
             
  public static void main(String args[])
  {
      Doraemon_Me frame = new Doraemon_Me();      
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