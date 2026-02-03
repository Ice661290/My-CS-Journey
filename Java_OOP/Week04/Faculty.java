class Faculty {  //class

  //Atrribute
  private String FID;
  private String FNAME;

//Constructor(This is not Default Constructor because java will create Default Constructor automatic)
  Faculty(){} //If we create it by myself. Default Constructor will delete

  Faculty(String fid){     //Constructor
    this.FID=fid;
  }
 
  Faculty(String fid,String fname){       //Constructor
    this.FID=fid;
    this.FNAME=fname;
  }


  public void setFID(String id){
    this.FID=id;
  }

  public String getFID(){
    return FID;
  }

  public void setFNAME(String name){
    this.FNAME=name;
  }

  public String getFNAME(){
    return FNAME;
  }
}