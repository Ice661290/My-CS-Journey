class Artist {      //class
//Attribute   
  private String AID;
  private String AName;
  private int Rating;
  private String AType;

//Constructor(This is not Default Constructor because java will create Default Constructor automatic)
  Artist(){} //If we create it by myself. Default Constructor will delete

  Artist(String id){     //Constructor
    this.AID=id;
  }
 
  Artist(String id,String name){       //Constructor
    this.AID=id;
    this.AName=name;
  }

  Artist(String id,String name,int rate){   //Constructor
    this.AID=id;
    this.AName=name;
    this.Rating=rate;
  } 

  Artist(String id,String name,int rate,String type){   //Constructor  
   this.AID=id;
   this.AName=name;
   this.Rating=rate;
   this.AType=type;
 } 


  public void setAID(String id){
      this.AID=id;
  }
  public String getAID(){
     return AID;
  }
  
  
  public void setAName(String name){
     this.AName=name;
  }
  public String getAName(){
     return AName;
  }
  
  
  public void setRating(int rate){
     this.Rating=rate;
  }
  public int getRating(){
     return Rating;
  }


  public void setAType(String type){
     this.AType=type;
  }
  public String getAType(){  
    return AType;
  }
}  