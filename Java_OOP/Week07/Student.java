class Student {
  private String ID;
  private String NAME;
  private double GPA;
  private Faculty Fac;   //we will connect relation between class student and class Faculty

  Student(){} //Constructor

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

  Student(String id,String name,double gpa,Faculty fac){   //Constructor  //A new one we can add in old but I want to show something
   this.ID=id;
   this.NAME=name;
   this.GPA=gpa;
   this.Fac=fac;
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

  public void setFac(Faculty fac){
     this.Fac=fac;
  }
  public Faculty getFac(){  //Faculty this is a data type that we build 
    return Fac;
  }
}  