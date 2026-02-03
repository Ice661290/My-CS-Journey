class Album {     //class
//Attribute   
  private String ABID;
  private String ABName;
  private double Price;
  private Artist Ar;  

//Constructor(This is not Default Constructor because java will create Default Constructor automatic)
  Album(){} //If we create it by myself. Default Constructor will delete

  Album(String id){     //Constructor
    this.ABID=id;
  }
  Album(String id,String name){       //Constructor
    this.ABID=id;
    this.ABName=name;
  }
  Album(String id,String name,double price){   //Constructor
    this.ABID=id;
    this.ABName=name;
    this.Price=price;
  } 
  Album(String id,String name,double price,Artist ar){   //Constructor  
   this.ABID=id;
   this.ABName=name;
   this.Price=price;
   this.Ar=ar;
 } 


  public void setABID(String id){
      this.ABID=id;
  }
  public String getABID(){
     return ABID;
  }
  

  public void setABName(String name){
     this.ABName=name;
  }
  public String getABName(){
     return ABName;
  }
  
  
  public void setPrice(double price){
     this.Price=price;
  }
  public double getPrice(){
     return Price;
  }


  public void setAr(Artist ar){
     this.Ar=ar;
  }
  public Artist getAr(){  
    return Ar;
  }
}  