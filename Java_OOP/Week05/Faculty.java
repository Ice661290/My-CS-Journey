class Faculty {
  private String FID;
  private String FNAME;

  Faculty(){} //Constructor

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