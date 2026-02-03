import javax.swing.JOptionPane;
class Exam
{  
   static final int max = 3;
   static Artist [] A = new Artist[max];  
   static Album [] AB = new Album[max];   
   static Exam E = new Exam();
   static int countA=0, countAB=0;    


public static void main (String[] args)
  {   int ch1;
      ch1 = E.menu();
      do{
          switch(ch1){
              case 1: E.createArtist();break;
              case 2: E.createAlbum();break;
              case 3: E.showArtist();break;
              case 4: E.showAlbum();break;
              default : break;
          }
          ch1 = E.menu();
      }while(ch1!=0);
  }         


public int menu(){
      int ch = Integer.parseInt(JOptionPane.showInputDialog("***Select Menu***"
                                                              + "\n 1.Create Artist"
                                                              + "\n 2.Create Album"
                                                              + "\n 3.Show Artist"
                                                              + "\n 4.Show Album"
                                                              + "\n 0.Exit"));
      return ch;    
  } 


public void createAlbum(){
      String id,name;
      double price;
      int i;
      
      id = JOptionPane.showInputDialog("Enter Album ID");
      name = JOptionPane.showInputDialog("Enter Album Name");
      price = Double.parseDouble(JOptionPane.showInputDialog("Enter Album Price"));
      i = E.selectArtist();
      
      AB[countAB] = new Album(id,name,price,A[i]);     
      countAB++;
  }


public int selectArtist(){
    int f;
    String output="**Select Artist**";
    for(int i=0;i<countA;i++){
        output += "\n No.: " + i ;
        output += "\n Artist ID: " + A[i].getAID();
        output += "\n Artist Name: " + A[i].getAName();
        output += "\nArtist Rating: " + A[i].getRating();
        output += "\nArtist Type: " + A[i].getAType();
    }
    f=Integer.parseInt(JOptionPane.showInputDialog(output));
    return f;
  }


public void createArtist(){
      String id,name,type;
      int rate;
      
      id = JOptionPane.showInputDialog("Enter Artist ID");
      name = JOptionPane.showInputDialog("Enter Artist Name");
      rate = Integer.parseInt(JOptionPane.showInputDialog("Enter Artist Rating"));
      type = JOptionPane.showInputDialog("Enter Artist Type");
      
      A[countA] = new Artist(id,name,rate,type);     
      countA++;
  }


public void showAlbum(){
      String output = "*****Album Lists*****";
        for(int i = 0;i<countAB; i++){
            output += "\nAlbum ID : " + AB[i].getABID();
            output += "\nAlbum Name: " + AB[i].getABName();
            output += "\nAlbum Price: " + AB[i].getPrice();
            output += "\nArtist: " + AB[i].getAr().getAName();
            output += "\n--------------------------------";
        }
     JOptionPane.showMessageDialog(null,output);      
  }


public void showArtist(){
      String output = "*****Artist Data*****"; 
       for(int i = 0;i<countA;i++){
        output += "\nArtist ID: " + A[i].getAID();
        output += "\nArtist Name: " + A[i].getAName();
        output += "\nArtist Rating: " + A[i].getRating();
        output += "\nArtist Type: " + A[i].getAType();
        output += "\n--------------------------";
       }JOptionPane.showMessageDialog(null,output);
  }
}