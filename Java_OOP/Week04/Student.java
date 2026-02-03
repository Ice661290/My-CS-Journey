class Student {  //class

 //Attribute
  private String ID;
  private String NAME;
  private double GPA;

 //Constructor(This is not Default Constructor because java will create Default Constructor automatic) 
  Student(){}  //If we create it by myself. Default Constructor will delete

  Student(String id){     //Constructor
    this.ID=id;
  }
 
  Student(String id,String name){       //Constructor
    this.ID=id;
    this.NAME=name;
  }

  Student(String id,String name,double gpa){   //Constructor
    this.ID=id;
    this.NAME=name;
    this.GPA=gpa;
  } 


  public void setID(String id){
      this.ID=id;
  }

  public String getID(){
     return ID;
  }
  
  public void setNAME(String name){
     this.NAME=name;
  }
  
  public String getNAME(){
     return NAME;
  }
  
  public void setGPA(double gpa){
     this.GPA=gpa;
  }
  
  public double getGPA(){
     return GPA;
  }
}  