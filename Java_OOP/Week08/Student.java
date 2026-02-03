class Student extends Person {  //extends is the java keyword use to inheritance for Person(who was mom)
    
    //Atrribute
    private double GPA;

    //Constructor
    Student(){}
    Student(String id){
        this.ID=id;
    }
    Student(String id,String name){
        this.ID=id;
        this.NAME=name;
    }
    Student(String id,String name,double gpa){
        this.ID=id;
        this.NAME=name;
        this.GPA=gpa;
    }
    Student(String id,String name,double gpa,Faculty fac){
        this.ID=id;
        this.NAME=name;
        this.GPA=gpa;
        this.FAC=fac;
    }
     
    //Method
    public void setGPA(double gpa){
        this.GPA=gpa;
    }
    public double getGPA(){
        return GPA;
    }

}
