public class Teacher extends Person {  //class

    //Atrribute
    private double SALARY;

    //Constructor
    Teacher(){}
    Teacher(String id){
        this.ID=id;
    }
    Teacher(String id,String name){
        this.ID=id;
        this.NAME=name;
    }
    Teacher(String id,String name,double salary){
        this.ID=id;
        this.NAME=name;
        this.SALARY=salary;
    }
    Teacher(String id,String name,double salary,Faculty fac){
        this.ID=id;
        this.NAME=name;
        this.SALARY=salary;
        this.FAC=fac;
    }

    //Method
    public void setSALARY(double salary){
        this.SALARY=salary;
    }
    public double getSALARY(){
        return SALARY;
    }
    
}
