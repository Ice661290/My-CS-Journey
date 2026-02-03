class Person{  //class

    //Atrribute
    protected String ID;
    protected String NAME;
    protected Faculty FAC;  //Call it for the inform this class
    
    //Constructor
    Person(){}   //Default Constructor
    Person(String id){   //Constructor and it will delete Default Constructor
        this.ID=id;
    }
    Person(String id,String name){   //Constructor and it will delete Default Constructor
        this.ID=id;                 //You can use this Constructor(L.12-14) but I Write like this(L.9-14) because I want to show how the code doing step by step
        this.NAME=name;
    }
    Person(String id,String name,Faculty fac){
        this.ID=id;
        this.NAME=name;
        this.FAC=fac;
    }
    
    //Method
    // Settter() and Getter() use to set value and use to return the value
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

    public void setFAC(Faculty fac){
        this.FAC=fac;
    }
    public Faculty getFAC(){
        return FAC;
    }
    
}